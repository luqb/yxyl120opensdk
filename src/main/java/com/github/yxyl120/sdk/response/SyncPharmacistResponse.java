package com.github.yxyl120.sdk.response;

import com.github.yxyl120.sdk.domain.PharmacistUser;

public class SyncPharmacistResponse extends AbstractResponse {

    private PharmacistUser data;

    public PharmacistUser getData() {
        return data;
    }

    public void setData(PharmacistUser data) {
        this.data = data;
    }
}
