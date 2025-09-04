package com.JdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionToDb {
	
	public Connection getCon() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
//		String url ="jdbc:mysql://localhost:3306/students";//database name is student
		String url ="jdbc:mysql://localhost:3306/cricket";//database name is student

		String username ="root";
		String password = "root";
		// for the mysql connector that i we downloaded, connector is not com.mysql.jdbc.Driver
		// we are changing the connector to com.mysql.cj.jdbc.Driver
		//Class.forName("com.mysql.cj.jdbc.Driver");//Load driver
		Class.forName("com.mysql.cj.jdbc.Driver");//Load driver

		// Checked exception, have to handle now so add throws
		
		//connection is interface, search for method which gives implementation
		//getconnection() static method from DriverManager class is used
		Connection con = DriverManager.getConnection(url, username, password);
		return con;

	}
}
