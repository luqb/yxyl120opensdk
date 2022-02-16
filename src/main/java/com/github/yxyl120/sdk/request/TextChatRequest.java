package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.domain.Chat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

public class TextChatRequest extends Chat implements YxRequest<EmptyResponse> {

    @ApiFieldProperty(value = "消息内容", required = true)
    private String content;

    public TextChatRequest(String orderSn, String content) {
        super(1, orderSn);
        this.content = content;
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
