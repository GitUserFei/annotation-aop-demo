package com.zhifei.dao;

import com.zhifei.model.Order;
import com.zhifei.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * className:UserDao
 * package:com.zhifei.dao
 * data:2018/10/12 8:04
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Mapper
public interface UserDao {
    @Select("select * from tbl_user where id=#{id}")
    User getById(@Param("id") int id);
}
