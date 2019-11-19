package com.briup.app.estore.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.service.ICustomerService;
import com.briup.app.estore.service.impl.CustomerServiceImp;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static ICustomerService customerService = new CustomerServiceImp();
	public RegisterServlet() {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = "/register.jsp";
		request.getRequestDispatcher(path).forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "注册成功 ";
		String path = "/login.jsp";
		// 获取参数
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String zip = request.getParameter("zip");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		// 封装对象
		Customer customer = new Customer();
		customer.setName(name);
		customer.setPassword(password);
		customer.setAddress(address);
		customer.setZip(zip);
		customer.setTelephone(telephone);
		customer.setEmail(email);
		// 逻辑处理
		//成功则进行，失败抛出异常
		try {
			customerService.registor(customer);
		} catch (Exception e) {
			msg = "注册失败！";
			path = "/register.jsp";
		} finally {
			// 结果返回
			request.setAttribute("msg", msg);
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}

}
