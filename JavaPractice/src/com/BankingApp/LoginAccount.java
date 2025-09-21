package com.BankingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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
//					System.out.println("Account No is : "+rs.getInt("ac_no"));
//					System.out.println("Available Balance is : "+rs.getInt("balance"));
					System.out.println("==================================");
					System.out.println("Select action you want to choose..");
					System.out.println("==================================");
					System.out.println("1. Transfer Money");
					System.out.println("2. View Balance");
					System.out.println("3. Logout");
					System.out.print("enter your choice : ");
					Scanner sc = new Scanner(System.in);
					int choice=sc.nextInt();
					if (choice == 1) {
						BankingOperations.transferMoney(rs.getInt("ac_no"),rs.getString("cname"));
					}
					if (choice==2) {
						System.out.println("Balance = "+rs.getInt("balance"));
						
					}
					if (choice==3) {
						System.out.println("Logging out");
						Bank.main(null);
						
					}
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
