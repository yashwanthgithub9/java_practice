package com.BankingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class BankingOperations {
	LoginAccount loginAccount= new LoginAccount();

	public static void transferMoney(int acc, String name) {
		// TODO Auto-generated method stub
		
		
	}

	public static void depositMoney(int deposit, int acc) {
		// TODO Auto-generated method stub
		String depositQ="update customer set balance = balance + ? where ac_no = ?";
		String selectQ="select * from customer where ac_no=?";
		Connection con = ConnectToMySQL.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(depositQ);
			ps.setInt(1, deposit);
			ps.setInt(2, acc);
			int rs= ps.executeUpdate();
			if(rs>0)
				System.out.println("Update successfull");
			PreparedStatement ps1=con.prepareStatement(selectQ);
			ps1.setInt(1,acc);
			ResultSet rs1 = ps1.executeQuery();
			System.out.println("Updated Balance after deposit is : "+rs1.getInt("balance"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
