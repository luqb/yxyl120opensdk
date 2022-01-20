package com.github.yxyl120.opensdk;

public class YxException extends Exception {

    public YxException() {
    }

    public YxException(String message) {
        super(message);
    }

    public YxException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
