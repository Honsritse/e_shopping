package com.briup.app.estore.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.mapper.CustomerMapper;
import com.briup.app.estore.service.ICustomerService;
import com.briup.app.estore.util.MyBatisSqlSessionFactory;

public class CustomerServiceImp implements ICustomerService {
	private static SqlSession sqlSession; 
	private static CustomerMapper mapper; 

	static {
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			mapper = sqlSession.getMapper(CustomerMapper.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void registor(Customer customer) throws Exception {
		
		Customer customerDB = mapper.selectByName(customer.getName());
		if(customerDB != null) {
			throw new Exception("用户名不可用："+customer.getName());
		}
		mapper.insert(customer);
		sqlSession.commit();
	}

	@Override
	public void updateCustomer(Customer customer) {
		mapper.updateByPrimaryKey(customer);
		sqlSession.commit();
	}

}
