package com.zhifei.dao;

import com.zhifei.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * className:OrderDao
 * package:com.zhifei.dao
 * data:2018/10/12 8:03
 * description:
 *
 * @author: zhouzhifei@163.com
 */
@Mapper
public interface OrderDao {
    //@Select("select * from order where id=#{id}")
    Order getById(int id);
}
