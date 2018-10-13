package com.zhifei.aspect;

import com.zhifei.util.BeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * className:SetValueAspect
 * package:com.zhifei.aspect
 * data:2018/10/12 19:23
 * description:
 * @author: zhouzhifei@163.com
 */
@Aspect
@Component
public class SetValueAspect {
    @Autowired
    BeanUtil beanUtil;

    @Around("@annotation(com.zhifei.annotation.IsSet)")
    //@Around(value = "execution(* com.zhifei.service.OrderService.getById(..))")
    public Object setValue(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = joinPoint.proceed();
        List<Object> list = Arrays.asList(proceed);
        beanUtil.setFieldValueForCollection(list);
        return proceed;
    }
}
