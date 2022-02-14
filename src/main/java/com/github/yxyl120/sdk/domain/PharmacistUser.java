package com.github.yxyl120.sdk.domain;

import java.io.Serializable;

public class PharmacistUser {

    /**
     * 一线平台的用户id
     */
    private Integer userId;

    /**
     * 合作平台的用户id
     */
    private Serializable userIdThree;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 状态，同步到一线平台后，需要等待审核通过才可以使用此用户信息
     */
    private int status;

    /**
     * 状态描述
     */
    private String statusDesc;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Serializable getUserIdThree() {
        return userIdThree;
    }

    public void setUserIdThree(Serializable userIdThree) {
        this.userIdThree = userIdThree;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
}
