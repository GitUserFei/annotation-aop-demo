package com.zhifei.controller;

import com.zhifei.model.Order;
import com.zhifei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:OrderController
 * package:com.zhifei.controller
 * data:2018/10/12 8:49
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @GetMapping("/get/{id}")
    public Order getOrderById(@PathVariable("id") int id){
        return orderService.getById(id);
    }
}
