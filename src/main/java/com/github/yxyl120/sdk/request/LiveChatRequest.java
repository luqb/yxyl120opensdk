package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.domain.Chat;
import com.github.yxyl120.sdk.response.EmptyResponse;

import java.util.Map;

/**
 * 发起视频聊天
 */
public class LiveChatRequest extends Chat implements YxRequest<EmptyResponse>{
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
    public Class<EmptyResponse> getResponseClass() {
        return EmptyResponse.class;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
