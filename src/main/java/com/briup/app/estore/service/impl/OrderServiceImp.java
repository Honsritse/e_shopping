package com.briup.app.estore.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.bean.Order;
import com.briup.app.estore.mapper.OrderMapper;
import com.briup.app.estore.service.IOrderService;
import com.briup.app.estore.util.MyBatisSqlSessionFactory;

public class OrderServiceImp implements IOrderService {
	private static SqlSession sqlSession;
	private static OrderMapper mapper;

	static {
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			mapper = sqlSession.getMapper(OrderMapper.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveOrder(Order order) {

		mapper.insert(order);
		sqlSession.commit();
		
		/*
		 * List<Order> orders = mapper.selectAll(); orders.forEach(T -> { if
		 * (T.getId().equals(order.getId())) { flag++; } }); if (flag != 0) {
		 * mapper.updateByPrimaryKey(order); } else { }
		 */
		
	}

	@Override
	public int countOrder(Customer customer) {
		int count = mapper.countByCustomer(customer.getId());
		sqlSession.commit();
		return count;
	}

	@Override
	public List<Order> getOrderByCustomer(Customer customer) {
		List<Order> list = mapper.selectByCustomerId(customer.getId());
		sqlSession.commit();
		return list;

	}

	@Override
	public void removeOrderById(int id) {
		mapper.deleteByPrimaryKey(id);
		sqlSession.commit();
	}
}
