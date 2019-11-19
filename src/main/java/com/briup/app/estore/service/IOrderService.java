package com.briup.app.estore.service;

import java.util.List;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.bean.Order;

public interface IOrderService {
	
	void saveOrder(Order order);
	
	void removeOrderById(int id);
	
	int countOrder(Customer customer);
	
	List<Order> getOrderByCustomer(Customer customer);
	
}
