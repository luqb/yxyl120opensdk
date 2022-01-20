package com.github.yxyl120.opensdk.domain;

import java.io.Serializable;

public class JsonResponse<T> implements Serializable {
    /**
     * 结果的描述
     */
    private String msg;
    /**
     * 操作结果识别码
     */
    private Integer code;
    /**
     * 返回的结果对象
     */
    private T data;
}
