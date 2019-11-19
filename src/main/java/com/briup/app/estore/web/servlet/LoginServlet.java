package com.briup.app.estore.web.servlet;

import java.io.IOException;	
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.briup.app.estore.bean.Customer;
import com.briup.app.estore.mapper.CustomerMapper;
import com.briup.app.estore.util.MyBatisSqlSessionFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/login.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession;
		System.out.println("Debug:Error");//Debug:错误测试
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
			String path = "/login.jsp";
			String msg = "";
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			
			Customer customerDB = mapper.selectByName(name);
			if(customerDB != null) {
				if(password.equals(customerDB.getPassword())) {
					path = "index.jsp";
					request.getSession().setAttribute("Customer", customerDB);
					request.getRequestDispatcher(path).forward(request, response);
				} else {
					msg = "用户名或密码错误";
					request.setAttribute("msg", msg);
					request.getRequestDispatcher(path).forward(request, response);
				}
			} else {
				msg = "用户名或密码错误";
				request.setAttribute("msg", msg);
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
