package estore.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {
	
	private DataSource dataSource;
	
	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("test.xml");
		dataSource = (DataSource) container.getBean("dataSource");
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		String sql = "select table_name from information_schema.TABLES where TABLE_SCHEMA='test'";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		statement.close();
		connection.close();
		container.close();
	}
	
}
