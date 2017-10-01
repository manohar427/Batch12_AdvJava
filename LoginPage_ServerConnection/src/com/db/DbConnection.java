package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {

			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Tester@123");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
