package org.sankalp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Assignment1";
	private static final String USERNAME = "root";
	private static final String PASSKEY = "root";
	
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL,USERNAME,PASSKEY);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
