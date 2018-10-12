package com.zhifei.model;

import lombok.*;

/**
 * className:Order
 * package:com.zhifei.model
 * data:2018/10/12 8:18
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
     private int id;
     private int userId;
     private String userName;
}
