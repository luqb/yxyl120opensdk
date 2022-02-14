package com.github.yxyl120.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.yxyl120.sdk.response.AbstractResponse;

import java.util.Map;

public interface YxRequest<T extends AbstractResponse> {
    /**
     * 接口
     *
     * @return 提交此参数的接口
     */
    @JsonIgnore
    String getApi();

    /**
     * url上传输的查询键值Map
     *
     * @return url上的键值Map
     */
    @JsonIgnore
    Map<String, Object> getQueryParam();

    /**
     * 请求接口返回的结果类型
     *
     * @return class
     */
    @JsonIgnore
    Class<T> getResponseClass();
}
