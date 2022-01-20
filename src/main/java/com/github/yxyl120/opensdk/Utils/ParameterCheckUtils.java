package com.github.yxyl120.opensdk.Utils;

import com.github.yxyl120.opensdk.YxException;
import com.github.yxyl120.opensdk.annotation.ApiFieldProperty;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ParameterCheckUtils {
    /**
     * 用于缓存类的属性字段
     */
    private static final Map<String, Map<Field, ApiFieldProperty>> fieldPropertys = new HashMap<>();

    public static void checkParameters(Object parameter) throws YxException {
        if (parameter == null) {
            throw new YxException("参数不能为空");
        }
        String simpleName = parameter.getClass().getName();
        Map<Field, ApiFieldProperty> propertyMap = fieldPropertys.get(simpleName);
        if (null == propertyMap) {
            propertyMap = new HashMap<>();
            for (Field field : parameter.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                propertyMap.put(field, field.getAnnotation(ApiFieldProperty.class));
            }
            fieldPropertys.put(simpleName, propertyMap);
        }

        try {
            for (Map.Entry<Field, ApiFieldProperty> entry : propertyMap.entrySet()) {
                ApiFieldProperty value = entry.getValue();
                Field key = entry.getKey();
                String name = key.getType().getName();
                if (value.required()) {
                    Object o = key.get(parameter);
                    if (o == null || ("java.lang.String".equals(name) && isEmpty((String) o))) {
                        throw new YxException("参数[" + key.getName() + "]不能为空,字段描述：" + value.notes());
                    }
                }
                if (value.multipartField()) {
                    checkParameters(key.get(parameter));
                }
            }
        } catch (IllegalAccessException ignored) {
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
