package com.github.yxyl120.sdk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.yxyl120.sdk.annotation.ApiFieldProperty;

public class Chat {

    @ApiFieldProperty(value = "消息类型", required = true)
    private int chatType;

    @ApiFieldProperty(value = "消息关联的处方单号", required = true)
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
