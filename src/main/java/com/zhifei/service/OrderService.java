package com.zhifei.service;

import com.zhifei.dao.OrderDao;
import com.zhifei.model.Order;
import com.zhifei.model.User;
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
    @Autowired
    private UserService userService;

    public Order getById(int id){
        Order order = orderDao.getById(id);
//        User user = userService.getById(order.getUserId());
//        order.setUserName(user.getUserName());
        return order;
    }
}
