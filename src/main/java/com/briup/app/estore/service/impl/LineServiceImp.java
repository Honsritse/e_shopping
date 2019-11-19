package com.briup.app.estore.service.impl;

import java.util.Collection;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.briup.app.estore.bean.Order;
import com.briup.app.estore.bean.Orderline;
import com.briup.app.estore.mapper.OrderlineMapper;
import com.briup.app.estore.service.ILineService;
import com.briup.app.estore.util.MyBatisSqlSessionFactory;

public class LineServiceImp implements ILineService {
	private static SqlSession sqlSession ;
	private OrderlineMapper mapper = sqlSession.getMapper(OrderlineMapper.class);

	static{
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void addLine(Orderline line) {

		mapper.insert(line);
		sqlSession.commit();
	}

	@Override
	public void addLines(Collection<Orderline> lines, Order order) {
		for (Orderline line : lines) {
			line.setOrder(order);
			mapper.insert(line);
		}
		sqlSession.commit();
	}

	@Override
	public void deleteLines(int orderId) {
		mapper.deleteLineByOrderId(orderId);
		sqlSession.commit();
	}

	@Override
	public Set<Orderline> getLinesByOrder(Order order) {
		Set<Orderline> list = mapper.selectAllByOrderId(order.getId());
		return list;
	}

}
