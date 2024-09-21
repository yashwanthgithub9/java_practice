package com.JdbcDemos;

import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class GetUpdate {

	public void update(String string) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String str = string;
		GetConnectionToDb gt = new GetConnectionToDb();
		Connection con =gt.getCon();
//		Statement st =gt.getCon().createStatement();
		java.sql.PreparedStatement ps = con.prepareStatement(str);
		ps.setString(1,"DC");
		ps.setDate(2, Date.valueOf("2024-09-09"));
		ps.setString(3, "LSG");
//		int rs = st.executeUpdate(string);
		int rs1= ps.executeUpdate();
		System.out.println("Effective number of rows = "+rs1);
		
	}

}
