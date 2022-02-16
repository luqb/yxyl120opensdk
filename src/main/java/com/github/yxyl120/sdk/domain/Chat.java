package com.github.yxyl120.sdk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Chat {

    private int chatType;

    private String orderSn;

    public Chat(int chatType, String orderSn) {
        this.chatType = chatType;
        this.orderSn = orderSn;
    }

    @JsonIgnore
    private String api ="/api/open/receivePatientMessage";

    @JsonIgnore
    public String getApi() {
        return api;
    }

    public int getChatType() {
        return chatType;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}
