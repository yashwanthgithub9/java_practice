package com.logindao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	String query = "select * from creds where uname=? and pass=?";
	String url="jdbc:mysql://localhost:3306/loginpage";
	String username="root";
	String password="root";
	public boolean checkusername(String us, String pwd) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, us);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

}
	public void display(String u, String p) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","root");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, u);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
