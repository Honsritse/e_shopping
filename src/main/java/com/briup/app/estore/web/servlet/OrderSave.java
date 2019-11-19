package com.briup.app.estore.web.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.bean.Order;
import com.briup.app.estore.bean.Orderline;
import com.briup.app.estore.service.ILineService;
import com.briup.app.estore.service.IOrderService;
import com.briup.app.estore.service.impl.LineServiceImp;
import com.briup.app.estore.service.impl.OrderServiceImp;
import com.briup.app.estore.shoppingcart.ShoppingCart;

@WebServlet("/orderSave")
public class OrderSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String path = "index.jsp";

	public OrderSave() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取购物车、当前顾客、创建订单
		ShoppingCart shopping = (ShoppingCart) request.getSession().getAttribute("shoppingCart");
		Customer customer = (Customer) request.getSession().getAttribute("Customer");
		Order newOrder = new Order();

		// 使用Service层
		IOrderService orderService = new OrderServiceImp();
		ILineService lineService = new LineServiceImp();

		// 用以传递数据的集合
//		List<Order> orders = customer.getOrders();
		Set<Orderline> lines = new HashSet<Orderline>();

		// 在DB中存储订单
		newOrder.setId((int) Math.abs(System.currentTimeMillis() % 1000));
		newOrder.setCost(shopping.getCost());
		newOrder.setCustomer(customer);
		newOrder.setOrderdate(new Date());
		orderService.saveOrder(newOrder);

		// 将购物车中的购买信息添加订单信息，并存入DB
		Map<Integer, Orderline> map = shopping.getMap();
		lines.addAll(map.values());
		lineService.addLines(lines, newOrder);

		// 清空购物车
		shopping.clear();
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
