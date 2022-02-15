package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.response.SyncPharmacistResponse;

import java.io.Serializable;

/**
 * 同步药师账号状态到一线
 */
public class SyncPharmacistStatusRequest extends AbsRequest implements YxRequest<SyncPharmacistResponse> {

    @ApiFieldProperty(value = "一线平台的用户id", required = true)
    private Serializable pharmacistId;

    @ApiFieldProperty(value = "药师账号状态：0 注销 | 1 启用", required = true)
    private Integer status;

    public SyncPharmacistStatusRequest() {
    }

    public SyncPharmacistStatusRequest(Serializable pharmacistId, Integer status) {
        this.pharmacistId = pharmacistId;
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

    public Serializable getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(Serializable pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
