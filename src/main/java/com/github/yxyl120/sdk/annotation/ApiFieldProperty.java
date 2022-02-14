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
     *
     * @return
     */
    String notes() default "";
}
