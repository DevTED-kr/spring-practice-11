package com.nouvolution.testDb3;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MysqlConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/spring_ex?useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "aa1327";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
			System.out.println(connection);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
