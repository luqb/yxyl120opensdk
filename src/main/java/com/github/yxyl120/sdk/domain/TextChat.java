package com.github.yxyl120.sdk.domain;

public class TextChat extends Chat {

    private String content;

    /**
     * 文本消息
     *
     * @param orderSn 订单号
     * @param content 内容
     */
    public TextChat(String orderSn, String content) {
        this.content = content;
        this.setOrderSn(orderSn);
        this.setChatType(1);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
