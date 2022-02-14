package com.github.yxyl120.sdk.request;

import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.response.SyncPharmacistResponse;

/**
 * 同步药师账号状态到一线
 */
public class SyncPharmacistStatusRequest extends AbsRequest implements YxRequest<SyncPharmacistResponse> {

    @ApiFieldProperty(value = "一线的药师id", required = true)
    private String pharmacistId;

    @ApiFieldProperty(value = "药师账号状态：0 注销 | 1 启用", required = true)
    private Integer status;

    @Override
    public String getApi() {
        return "/api/open/syncPharmacist";
    }

    @Override
    public Class<SyncPharmacistResponse> getResponseClass() {
        return SyncPharmacistResponse.class;
    }

    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }
}
