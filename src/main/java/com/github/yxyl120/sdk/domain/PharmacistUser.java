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
     * 用户姓名
     */
    private String name;
    /**
     * 用户在一线的账号
     */
    private String userAccount;

    /**
     * 用户在一线的账号密码
     */
    private String userPassword;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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
