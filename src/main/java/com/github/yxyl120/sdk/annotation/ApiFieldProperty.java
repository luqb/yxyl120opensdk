package com.github.yxyl120.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记参数实体属性
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiFieldProperty {

    String value() default "";

    /**
     * 指定是否需要该参数。默认必须
     */
    boolean required() default false;

    /**
     * 校验子类属性
     *
     * @return 默认不校验
     */
    boolean validClass() default false;

    /**
     * 加密属性值
     * @return AES等等方式加密字段属性，暂时只支持AES
     */
    String encrypted() default "";

}
