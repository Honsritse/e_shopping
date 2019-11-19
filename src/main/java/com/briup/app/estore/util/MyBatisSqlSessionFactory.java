package com.briup.app.estore.util;

import org.apache.ibatis.session.SqlSession;	
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSqlSessionFactory {
	
	
	private static SqlSessionFactory sqlSessionFactory;
	
	
	public static SqlSessionFactory getSqlSessionFactory() throws Exception{
		

		if(sqlSessionFactory == null){
			String path = "spring_mybatis.xml";
			ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
			sqlSessionFactory = (SqlSessionFactory) container.getBean("sqlSessionFactory");
			container.close();
			return sqlSessionFactory;
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSession() throws Exception { 
		return openSession(false); 
	}
	public static SqlSession openSession(boolean autoCommit) throws Exception { 
		return getSqlSessionFactory().openSession(autoCommit); 
	}
}
