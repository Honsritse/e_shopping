package com.briup.app.estore.service;

import java.util.Collection;
import java.util.Set;

import com.briup.app.estore.bean.Order;
import com.briup.app.estore.bean.Orderline;

public interface ILineService {

	void addLine(Orderline line);
	
	void addLines(Collection<Orderline> lines,Order order);
	
	void deleteLines(int orderId);
	
	Set<Orderline> getLinesByOrder(Order order);
	
}
