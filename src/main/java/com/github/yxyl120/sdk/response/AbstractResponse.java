package com.github.yxyl120.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.yxyl120.sdk.enums.ResponseCode;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbstractResponse implements Serializable {

    /**
     * 响应编码{@link ResponseCode#getCode()}
     */
    protected int code;

    /**
     * 响应描述
     */
    protected String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
