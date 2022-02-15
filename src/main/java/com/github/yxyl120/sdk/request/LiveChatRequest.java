package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.LiveChat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 发起视频聊天
 */
public class LiveChatRequest extends LiveChat implements YxRequest<EmptyResponse>{

    public LiveChatRequest(String orderSn) {
        super(orderSn);
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
