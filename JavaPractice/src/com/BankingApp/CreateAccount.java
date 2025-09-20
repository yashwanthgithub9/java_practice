package com.BankingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccount {

	public static void newAccount() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con1=ConnectToMySQL.getConnection();
		System.out.println("enter username:");
		String uname=sc.next();
		System.out.println("enter pass code:");
		int passcode=sc.nextInt();
		String selectQuery="select * from customer";
		String insertQuery="insert into customer(cname,balance,pass_code) values(?,1000,?)";
		try {
			PreparedStatement ps= con1.prepareStatement(insertQuery);
			ps.setString(1, uname);
			ps.setInt(2, passcode);
			int rows=ps.executeUpdate();
			if (rows==1) {
				System.out.println("Account created successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
