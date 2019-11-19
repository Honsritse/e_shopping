package com.briup.app.estore.mapper;

import java.util.List;

import com.briup.app.estore.bean.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer id);

    List<Order> selectAll();

    List<Order> selectByCustomerId(Integer customId);

    int updateByPrimaryKey(Order record);
    
    int countByCustomer(int customId);
    
}