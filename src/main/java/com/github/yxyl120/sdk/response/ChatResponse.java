package com.github.yxyl120.sdk.response;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;

public class ChatResponse extends AbstractResponse {

    @ApiFieldProperty("合作方的处方单号")
    private String orderSnThird;

    @ApiFieldProperty("一线平台的处方单号")
    private String orderSn;

    @ApiFieldProperty("消息id")
    private String msgId;


    public String getOrderSnThird() {
        return orderSnThird;
    }

    public void setOrderSnThird(String orderSnThird) {
        this.orderSnThird = orderSnThird;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
