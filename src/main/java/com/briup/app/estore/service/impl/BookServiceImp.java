package com.briup.app.estore.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.app.estore.bean.Book;
import com.briup.app.estore.mapper.BookMapper;
import com.briup.app.estore.service.IBookService;
import com.briup.app.estore.util.MyBatisSqlSessionFactory;

public class BookServiceImp implements IBookService {

	@Override 
	public Book getBookById(int id){
		
		SqlSession sqlSession;
		Book book = null;
		try {
			sqlSession = MyBatisSqlSessionFactory.openSession();
			BookMapper mapper = sqlSession.getMapper(BookMapper.class);
			book = mapper.selectByPrimaryKey(id);
			sqlSession.commit();
			return book;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

}
