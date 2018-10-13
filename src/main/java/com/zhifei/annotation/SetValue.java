package com.zhifei.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * className:SetValue
 * package:com.zhifei.annotation
 * data:2018/10/12 13:25
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SetValue {
    Class<?> beanClass();
    String method();
    String paramField();
    String targetField();
}
