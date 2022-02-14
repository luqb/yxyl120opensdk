package com.github.yxyl120.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Encrypted {
    /**
     * 入参时是否需要解密
     *
     * @return 默认为需要
     */
    boolean inDecode() default true;

    /**
     * 加密方式
     *
     * @return -
     */
    String type() default "AES";

    /**
     * 返参时是否需要加密
     *
     * @return 默认为需要
     */
    boolean outEncode() default true;

}
