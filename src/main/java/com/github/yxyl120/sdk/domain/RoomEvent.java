package com.github.yxyl120.sdk.domain;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;

/**
 * 回调到第三方的房间事件信息
 */
public class RoomEvent {


    @ApiFieldProperty("关联的处方单号")
    private String orderSn;

    @ApiFieldProperty("回调时间，单位毫秒")
    private Long callbackTs;

    @ApiFieldProperty("数字房间号")
    private Long roomId;

    @ApiFieldProperty("房间事件码,LiveEventType.code")
    private Integer eventCode;

    @ApiFieldProperty("房间事件枚举,LiveEventType")
    private String event;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getCallbackTs() {
        return callbackTs;
    }

    public void setCallbackTs(Long callbackTs) {
        this.callbackTs = callbackTs;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getEventCode() {
        return eventCode;
    }

    public void setEventCode(Integer eventCode) {
        this.eventCode = eventCode;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
