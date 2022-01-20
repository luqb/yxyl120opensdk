package com.github.yxyl120.opensdk.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.yxyl120.opensdk.YxException;
import com.github.yxyl120.opensdk.domain.RequestParameter;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class SignUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static String sign(RequestParameter parameter) throws YxException {
        try {
            long timestamp = System.currentTimeMillis();
            parameter.setTimestamp(timestamp);

            List<String> list = new LinkedList<>();

            list.add(parameter.getAct_id());
            list.add(parameter.getManu_id());
            list.add(parameter.getApp_id());
            list.add(String.valueOf(timestamp));
            // 大于等于1.0之后的版本需要将传参也带上进行签名
            if (parameter.getVersion() >= 1.0) {
                ObjectMapper mapper = new ObjectMapper();
                list.add(mapper.writeValueAsString(parameter.getData()));
            }
            byte[] bytes = String.join("&", list).getBytes(UTF_8);
            return DigestUtils.md5Hex(bytes).toUpperCase();
        } catch (Exception ex) {
            throw new YxException("签名失败", ex);
        }
    }


}
