package com.zhifei.dao;

import com.zhifei.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    @Select("select * from tbl_order where id=#{id}")
    Order getById(@Param("id") int id);
}
