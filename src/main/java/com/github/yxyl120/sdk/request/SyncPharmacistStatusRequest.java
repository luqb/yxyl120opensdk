package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.response.SyncPharmacistResponse;

import java.io.Serializable;

/**
 * 同步药师账号状态到一线
 */
public class SyncPharmacistStatusRequest extends AbsRequest implements YxRequest<SyncPharmacistResponse> {

    @ApiFieldProperty(value = "合作方的用户id", required = true)
    private Serializable pharmacistIdThird;

    @ApiFieldProperty(value = "药师账号状态：0 注销 | 1 启用", required = true)
    private Integer status;

    public SyncPharmacistStatusRequest() {
    }

    /**
     * 构造同步状态的请求
     *
     * @param pharmacistIdThird 合作方的用户id
     * @param status            药师账号状态
     */
    public SyncPharmacistStatusRequest(Serializable pharmacistIdThird, Integer status) {
        this.pharmacistIdThird = pharmacistIdThird;
        this.status = status;
    }

    @Override
    public String getApi() {
        return "/api/open/syncPharmacist";
    }

    @Override
    public Class<SyncPharmacistResponse> getResponseClass() {
        return SyncPharmacistResponse.class;
    }

    public Serializable getPharmacistIdThird() {
        return pharmacistIdThird;
    }

    public void setPharmacistIdThird(Serializable pharmacistIdThird) {
        this.pharmacistIdThird = pharmacistIdThird;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
