package com.github.yxyl120.opensdk.domain;

import com.github.yxyl120.opensdk.annotation.ApiFieldProperty;

public class RequestParameter<T> {

    /**
     * 操作码
     */
    @ApiFieldProperty(notes = "操作码")
    private String act_id;
    /**
     * 为对接厂商提供的编码
     */
    @ApiFieldProperty(notes = "为对接厂商提供的编码")
    private String manu_id;
    /**
     * 分配给厂商对接的互联网医院编码
     */
    @ApiFieldProperty(notes = "分配给厂商对接的互联网医院编码")
    private String app_id;

    @ApiFieldProperty(notes = "接口版本")
    private double version;


    /**
     * 请求的时间戳
     */
    @ApiFieldProperty(notes = "请求的时间戳")
    private long timestamp;
    /**
     * 签名结果
     */
    @ApiFieldProperty(notes = "签名结果",required = false)
    private String sig;

    @ApiFieldProperty(notes = "本次提交的数据参数", multipartField = true)
    private T data;

    public RequestParameter() {

    }

    public String getAct_id() {
        return act_id;
    }

    public void setAct_id(String act_id) {
        this.act_id = act_id;
    }

    public String getManu_id() {
        return manu_id;
    }

    public void setManu_id(String manu_id) {
        this.manu_id = manu_id;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
