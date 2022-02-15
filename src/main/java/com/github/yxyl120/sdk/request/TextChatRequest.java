package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.TextChat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

public class TextChatRequest extends TextChat implements YxRequest<EmptyResponse>{

    public TextChatRequest(String orderSn, String content) {
        super(orderSn, content);
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
