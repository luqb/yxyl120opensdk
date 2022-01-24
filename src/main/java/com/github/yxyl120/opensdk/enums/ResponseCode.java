package com.github.yxyl120.opensdk.enums;

/**
 * 一线服务器返回的响应码与说明
 */
public enum ResponseCode {

    SUCCESS(200, "请求成功"),

    InvalidAppId(201, "appId非法"),
    InvalidSecret(201, "密钥非法"),
    SignatureExpire(301, "签名过期。Timestamp 和服务器时间相差不得超过五分钟，请检查本地时间是否和标准时间同步"),
    SignatureFailure(302, "签名错误。签名计算错误，请对照调用方式中的签名方法文档检查签名计算过程"),
    MissingParameter(501, "缺少参数"),
    InvalidParameter(502, "参数错误（包括参数格式、类型等错误）"),
    InvalidParameterValue(503, "参数取值错误"),
    ServiceError(400, "服务器内部错误");

    private int code;

    private String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
