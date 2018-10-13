package com.zhifei.model;

import com.zhifei.annotation.SetValue;
import com.zhifei.dao.UserDao;
import lombok.*;

/**
 * className:Order
 * package:com.zhifei.model
 * data:2018/10/12 8:18
 * description:
 *
 * @author: zhouzhifei@163.com
 */
public class Order {
     private int id;
     private int userId;
     @SetValue(beanClass= UserDao.class,method="getById",paramField="userId",targetField="userName")
     private String userName;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public int getUserId() {
          return userId;
     }

     public void setUserId(int userId) {
          this.userId = userId;
     }

     public String getUserName() {
          return userName;
     }

     public void setUserName(String userName) {
          this.userName = userName;
     }

     @Override
     public String toString() {
          return "Order{" +
                  "id=" + id +
                  ", userId=" + userId +
                  ", userName='" + userName + '\'' +
                  '}';
     }
}
