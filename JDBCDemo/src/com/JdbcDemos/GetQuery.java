package com.JdbcDemos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetQuery {

	public void query(String string) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String str = string;
		GetConnectionToDb gt = new GetConnectionToDb();
		Statement st =gt.getCon().createStatement();
		ResultSet rs = st.executeQuery(string);
		int col=rs.getMetaData().getColumnCount();
		System.out.println(col);
		while (rs.next()) {
//			System.out.println(rs);
			System.out.println(rs.getString(1)+" "+rs.getDate(2)+" "+rs.getString(3));

		}
		
		// lets try to fetch all values from select query using result set.
//		while (col>0 && rs.next()) {
//			System.out.println(rs.getString(1)+" "+rs.getObject(2)+" "+rs.getObject(2));
//			
//		}
		
	}

}
