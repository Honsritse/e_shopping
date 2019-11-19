package com.briup.app.estore.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.app.estore.service.ILineService;
import com.briup.app.estore.service.IOrderService;
import com.briup.app.estore.service.impl.LineServiceImp;
import com.briup.app.estore.service.impl.OrderServiceImp;

@WebServlet("/orderRemove")
public class OrderRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String path = "user/order.jsp";
    public OrderRemove() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ILineService lineService = new LineServiceImp();
		IOrderService orderService = new OrderServiceImp();
		
		lineService.deleteLines(id);
		orderService.removeOrderById(id);
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
