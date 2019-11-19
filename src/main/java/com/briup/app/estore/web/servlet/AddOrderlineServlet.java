package com.briup.app.estore.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.app.estore.bean.Book;
import com.briup.app.estore.bean.Orderline;
import com.briup.app.estore.service.impl.BookServiceImp;
import com.briup.app.estore.shoppingcart.ShoppingCart;

@WebServlet("/addShopcar")
public class AddOrderlineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String path = "index.jsp";   
	
    public AddOrderlineServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookId = request.getParameter("bookId");
		Book book = new BookServiceImp().getBookById(Integer.parseInt(bookId));
		
		
//		System.out.println("Debug:"+request.getSession().getAttribute("Customer"));//Debug:获取用户对象
		
		Orderline orderline = new Orderline();
		orderline.setBook(book);
		
		ShoppingCart shoppingCart = (ShoppingCart) request.getSession().getAttribute("shoppingCart");
		shoppingCart.add(orderline);
		
		request.getSession().setAttribute("shoppingCart", shoppingCart);
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
