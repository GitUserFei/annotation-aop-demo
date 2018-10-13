package com.zhifei.service;

import com.zhifei.annotation.IsSet;
import com.zhifei.dao.OrderDao;
import com.zhifei.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * className:OrderService
 * package:com.zhifei.service
 * data:2018/10/12 8:46
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    @IsSet
    public Order getById(int id){
        Order order = orderDao.getById(id);
        /**
         * 分析：代码耦和度太高，而且影响开发效率，使用注解和Aop的形式进行解耦和
         */
//        User user = userService.getById(order.getUserId());
//        if (!StringUtils.isEmpty(user)){
//            order.setUserName(user.getUserName());
//        }
        return order;
    }
}
