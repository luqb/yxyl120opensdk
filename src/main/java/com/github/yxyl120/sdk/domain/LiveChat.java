package com.github.yxyl120.sdk.domain;

public class LiveChat extends Chat {

    /**
     * 发起的时间戳
     */
    private long timeStamp;

    public LiveChat(String orderSn) {
        this.timeStamp = System.currentTimeMillis();
        this.setChatType(4);
        this.setOrderSn(orderSn);
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
