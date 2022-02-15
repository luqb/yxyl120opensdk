package com.github.yxyl120.sdk;

import com.github.yxyl120.sdk.request.YxRequest;
import com.github.yxyl120.sdk.response.AbstractResponse;

public interface YxClient {
    <T extends AbstractResponse> T execute(YxRequest<T> request) throws YxException;
}
