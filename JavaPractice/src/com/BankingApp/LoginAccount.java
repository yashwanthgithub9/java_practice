package com.BankingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAccount {
	
	String selectQuery="select ac_no from customer where cname =? and pass_code = ?";

	public static boolean checkLogin(String user, int pass) {
		Connection con=ConnectToMySQL.getConnection();
		try {
			String passcode="select * from customer where cname = ?";
			PreparedStatement ps = con.prepareStatement(passcode);
			ps.setString(1, user);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int passcode1=rs.getInt("pass_code");
				if (passcode1==pass) {
					System.out.println("Login Successful");
					System.out.println("Account No is : "+rs.getInt("ac_no"));
					System.out.println("Available Balance is : "+rs.getInt("balance"));
				}
				else
					System.out.println("Login failed re check userame and passcode");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean loggedin=false;
		
		return loggedin;
		// TODO Auto-generated method stub
		
	}

	public static void printDetails() {
		// TODO Auto-generated method stub
		
	}

	public static boolean checkUsername(String u) {
		// TODO Auto-generated method stub
		Connection con=ConnectToMySQL.getConnection();
		try {
			PreparedStatement ps= con.prepareStatement("select * from customer where cname = ?");
			ps.setString(1, u);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
