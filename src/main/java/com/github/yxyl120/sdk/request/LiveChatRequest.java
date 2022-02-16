package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.Chat;
import com.github.yxyl120.sdk.response.ChatResponse;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 发起视频聊天
 */
public class LiveChatRequest extends Chat implements YxRequest<ChatResponse>{
    /**
     * 发起的时间戳
     */
    private long timeStamp;

    public LiveChatRequest(String orderSn) {
        super(4,orderSn);
        this.timeStamp = System.currentTimeMillis();
    }

    @Override
    public Map<String, Object> getQueryParam() {
        return null;
    }

    @Override
    public Class<ChatResponse> getResponseClass() {
        return ChatResponse.class;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
