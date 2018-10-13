package com.zhifei.util;

import com.zhifei.annotation.SetValue;
import com.zhifei.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import sun.plugin.com.BeanClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * className:BeanUtil
 * package:com.zhifei.util
 * data:2018/10/12 18:34
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Component
public class BeanUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public static void setFieldValueForCollection(Collection cl){
        if (CollectionUtils.isEmpty(cl)){
            return ;
        }
        //获取需要设置值的对象
        Object needSetObj = cl.iterator().next();
        //获取集合中元素的Class对象
        Class<?> clazz = needSetObj.getClass();
        //获取里面的字段
        Field[] fields = clazz.getDeclaredFields();
        //遍历Class中的字段，看字段是否需要设置值
        for (Field needSetField:fields){
            //判断字段上面是否有相关的注解
            SetValue setValue = needSetField.getAnnotation(SetValue.class);
            if (setValue==null){
                continue;
            }
            //设置需要设值字段的可访问性
            needSetField.setAccessible(true);

            //获取目标对象
            Object targetObj = applicationContext.getBean(setValue.beanClass());
            try {
                //获取目标对象的目标方法
                Method method = setValue.beanClass().getMethod(setValue.method(),int.class);
                //获取传入参数字段
                Field field = clazz.getDeclaredField(setValue.paramField());
                field.setAccessible(true);
                //获取目标对象调用方法之后的对象
                Object returnObj = method.invoke(targetObj,field.get(needSetObj));
                Field targetField = returnObj.getClass().getDeclaredField(setValue.targetField());
                targetField.setAccessible(true);
                Object value = targetField.get(returnObj);
                //设置需要设值字段的值
                needSetField.setAccessible(true);
                needSetField.set(needSetObj,value);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
