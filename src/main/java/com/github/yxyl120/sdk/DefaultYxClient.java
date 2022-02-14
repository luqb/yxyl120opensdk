package com.github.yxyl120.sdk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.yxyl120.sdk.Utils.CheckRequestUtils;
import com.github.yxyl120.sdk.Utils.HttpUtils;
import com.github.yxyl120.sdk.request.YxRequest;
import com.github.yxyl120.sdk.response.AbstractResponse;
import org.springframework.util.DigestUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class DefaultYxClient implements YxClient {

    private String serverUrl;
    private String appId;
    private String appSecret;
    private ObjectMapper mapper;
    private static final String ENC = "UTF-8";

    public DefaultYxClient(String serverUrl, String appId, String appSecret) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.appSecret = appSecret;
        this.mapper = new ObjectMapper();
    }

    /**
     * 执行请求
     *
     * @param request 入参
     * @param <T>     返回的类型
     * @return 返回的实体类
     */
    @Override
    public <T extends AbstractResponse> T execute(YxRequest<T> request) {
        CheckRequestUtils.doCheck(request, this.appSecret, this.appSecret.substring(0, 16));
        String bodyStr = toJson(request);
        String url = this.buildUrl(request, bodyStr);
        String responseBodyStr = HttpUtils.post(url, bodyStr);
        T readValue = parse(responseBodyStr, request.getResponseClass());
        if (readValue == null) {
            throw new YxException("解析数据异常：" + responseBodyStr, 400);
        }
        if (readValue.getCode() != SUCCESS_CODE) {
            throw new YxException(readValue.getMsg(), readValue.getCode());
        }
        return readValue;
    }

    private <T> T parse(String jsonStr, Class<T> tClass) {
        try {
            return mapper.readValue(jsonStr, tClass);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    private String buildUrl(YxRequest request, String body) {
        Map<String, Object> pmap = new TreeMap<>();
        pmap.put("timestamp", System.currentTimeMillis());
        pmap.put("appId", this.appId);
        pmap.put("version", "1.0");
        pmap.put("signMethod", "md5Hex");
        if (request.getQueryParam() != null && request.getQueryParam().size() > 0) {
            pmap.putAll(request.getQueryParam());
        }
        ArrayList<String> keys = new ArrayList<>(pmap.keySet());
        Collections.sort(keys);

        StringBuilder buffer = new StringBuilder();
        try {
            for (String key : keys) {
                if (buffer.length() != 0) {
                    buffer.append('&');
                }
                Object value = pmap.get(key);
                buffer.append(key).append('=').append(obj2URLEncoder(value));
            }
        } catch (Exception ignored) {
        }
        String query = buffer.toString();
        buffer.append("&appSecret=")
                .append(this.appSecret)
                .append("&body=").append(body);
        System.out.println(buffer.toString());

        String sign = DigestUtils.md5DigestAsHex(buffer.toString().getBytes(StandardCharsets.UTF_8));

        return this.serverUrl + request.getApi() + "?" + query + "&sign=" + sign;
    }

    private String obj2URLEncoder(Object object) throws Exception {
        if (object instanceof String || object instanceof Number) {
            return URLEncoder.encode(object.toString(), ENC);
        }
        return URLEncoder.encode(toJson(object), ENC);
    }

    private String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
