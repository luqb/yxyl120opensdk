package com.github.yxyl120.sdk.Utils;

import com.github.yxyl120.sdk.YxException;
import com.github.yxyl120.sdk.annotation.ApiFieldProperty;
import com.github.yxyl120.sdk.annotation.Valid;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CheckRequestUtils {
    /**
     * 用于缓存类的属性字段
     */
    private static final Map<String, Map<Field, ApiFieldProperty>> fieldPropertys = new HashMap<>();

    public static void doCheck(Object parameter) throws YxException {
        if (parameter == null) {
            throw new YxException("参数不能为空", 400);
        }
        String simpleName = parameter.getClass().getName();
        Map<Field, ApiFieldProperty> propertyMap = fieldPropertys.get(simpleName);
        if (null == propertyMap) {
            propertyMap = new HashMap<>();
            for (Field field : parameter.getClass().getDeclaredFields()) {
                ApiFieldProperty fieldAnnotation = field.getAnnotation(ApiFieldProperty.class);
                if (fieldAnnotation != null) {
                    field.setAccessible(true);
                    propertyMap.put(field, fieldAnnotation);
                }
            }
            fieldPropertys.put(simpleName, propertyMap);
        }

        try {
            for (Map.Entry<Field, ApiFieldProperty> entry : propertyMap.entrySet()) {
                Field key = entry.getKey();
                String name = key.getType().getName();
                if (entry.getValue().required()) {
                    Object value = key.get(parameter);
                    if (value == null || ("java.lang.String".equals(name) && isEmpty((String) value))) {
                        throw new YxException("参数[" + key.getName() + "]不能为空,字段描述：" + entry.getValue().notes(), 400);
                    }
                }
                if (entry.getKey().getAnnotation(Valid.class) != null) {
                    doCheck(key.get(parameter));
                }
            }
        } catch (IllegalAccessException ignored) {
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
