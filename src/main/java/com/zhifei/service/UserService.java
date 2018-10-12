package com.zhifei.service;

import com.zhifei.dao.UserDao;
import com.zhifei.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * className:UserService
 * package:com.zhifei.service
 * data:2018/10/12 8:46
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }
}
