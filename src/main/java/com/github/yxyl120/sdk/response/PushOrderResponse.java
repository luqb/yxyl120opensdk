package com.github.yxyl120.sdk.response;

import com.github.yxyl120.sdk.domain.RoomInfo;

public class PushOrderResponse extends AbstractResponse {

    private RoomInfo data;

    @Override
    public String toString() {
        return "PushOrderResponse{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public RoomInfo getData() {
        return data;
    }

    public void setData(RoomInfo data) {
        this.data = data;
    }
}
