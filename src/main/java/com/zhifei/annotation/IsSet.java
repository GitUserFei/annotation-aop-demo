package com.zhifei.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * className:IsSet
 * package:com.zhifei.annotation
 * data:2018/10/12 19:22
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsSet {
}
