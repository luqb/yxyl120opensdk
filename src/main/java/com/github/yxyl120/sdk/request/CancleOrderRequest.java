package com.github.yxyl120.sdk.request;


public class CancleOrderRequest extends AbsRequest implements YxRequest {
    /**
     * 一线平台返回的处方号
     */
    private String orderSn;

    @Override
    public String getApi() {
        return "/api/open/cancelOrder";
    }

    @Override
    public Class getResponseClass() {
        return null;
    }

    public CancleOrderRequest() {

    }

    public CancleOrderRequest(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}
