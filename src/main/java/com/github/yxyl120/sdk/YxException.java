package com.github.yxyl120.sdk;

public class YxException extends RuntimeException {
    /**
     * 响应码
     */
    private int code;

    public YxException(int code) {
        this.code = code;
    }

    public YxException(String message, int code) {
        super(message);
        this.code = code;
    }

    public YxException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public YxException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public YxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
