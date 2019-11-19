package com.briup.app.estore.service;

import com.briup.app.estore.bean.Customer;

public interface ICustomerService {
	
	void registor(Customer customer) throws Exception;
	
	void updateCustomer(Customer customer);
}

