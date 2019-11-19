package com.briup.app.estore.mapper;

import java.util.List;
import java.util.Set;

import com.briup.app.estore.bean.Orderline;

public interface OrderlineMapper {
    int deleteByPrimaryKey(Integer id);
    
    void deleteLineByOrderId(int orderId);

    int insert(Orderline record);

    Orderline selectByPrimaryKey(Integer id);
    
    Set<Orderline> selectAllByOrderId(int OrderId);

    List<Orderline> selectAll();

    int updateByPrimaryKey(Orderline record);
}