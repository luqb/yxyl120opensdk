package com.github.yxyl120.sdk.enums;

/**
 * 房间事件枚举
 */
public enum LiveEventType {

    EVENT_TYPE_CREATE_ROOM(101, "创建房间"),
    EVENT_TYPE_DISMISS_ROOM(102, "解散房间"),
    EVENT_TYPE_ENTER_ROOM(103, "进入房间"),
    EVENT_TYPE_EXIT_ROOM(104, "退出房间");
    private int code;
    private String desc;

    LiveEventType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
