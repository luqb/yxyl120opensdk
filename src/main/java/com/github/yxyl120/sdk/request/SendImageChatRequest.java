package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.ImageChat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 发送图片消息到医生
 */
public class SendImageChatRequest extends ImageChat implements YxRequest<EmptyResponse> {

    public SendImageChatRequest(String orderSn, String imgUrl) {
        super(orderSn, imgUrl);
    }

    @Override
    public String getApi() {
        return "/api/open/sendTextChat";
    }

    @Override
    public Map<String, Object> getQueryParam() {
        return null;
    }

    @Override
    public Class<EmptyResponse> getResponseClass() {
        return EmptyResponse.class;
    }
}
