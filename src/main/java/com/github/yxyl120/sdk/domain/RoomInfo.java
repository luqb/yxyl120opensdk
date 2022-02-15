package com.github.yxyl120.sdk.domain;

public class RoomInfo {
    /**
     * 房间关联的订单号
     */
    private String orderId;
    /**
     * 房间关联的处方号
     */
    private String orderSn;

    /**
     * 房间号
     */
    private Long roomId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 签名信息
     */
    private String sign;

    /**
     * 腾讯实时音视频appid
     */
    private Long trtcAppId;

    /**
     * 房间平台，暂时为固定值 TRTC
     */
    private String roomPlatform;
    /**
     * 房间平台描述,暂时为固定值 腾讯实时音视频
     */
    private String roomPlatformDesc;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getTrtcAppId() {
        return trtcAppId;
    }

    public void setTrtcAppId(Long trtcAppId) {
        this.trtcAppId = trtcAppId;
    }

    public String getRoomPlatform() {
        return roomPlatform;
    }

    public void setRoomPlatform(String roomPlatform) {
        this.roomPlatform = roomPlatform;
    }

    public String getRoomPlatformDesc() {
        return roomPlatformDesc;
    }

    public void setRoomPlatformDesc(String roomPlatformDesc) {
        this.roomPlatformDesc = roomPlatformDesc;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
                "orderId='" + orderId + '\'' +
                ", orderSn='" + orderSn + '\'' +
                ", roomId=" + roomId +
                ", userId='" + userId + '\'' +
                ", sign='" + sign + '\'' +
                ", roomPlatform='" + roomPlatform + '\'' +
                ", roomPlatformDesc='" + roomPlatformDesc + '\'' +
                '}';
    }
}
