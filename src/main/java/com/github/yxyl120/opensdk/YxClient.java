package com.github.yxyl120.opensdk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.yxyl120.opensdk.Utils.HttpUtils;
import com.github.yxyl120.opensdk.Utils.ParameterCheckUtils;
import com.github.yxyl120.opensdk.Utils.SignUtils;
import com.github.yxyl120.opensdk.domain.RequestParameter;
import com.github.yxyl120.opensdk.domain.order.OrderInfo;

public class YxClient {

    /**
     * 推送订单到一线平台
     *
     * @param api       接口
     * @param parameter 接口参数
     * @return 推送结果
     * @throws YxException
     */
    public static String pushOrder(String api, RequestParameter<OrderInfo> parameter) throws YxException {
        ParameterCheckUtils.checkParameters(parameter);
        String sign = SignUtils.sign(parameter);
        parameter.setSig(sign);
        return HttpUtils.post(api, toJson(parameter));
    }

    private static String toJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
