package com.logindao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Class;

public class LoginDAO{
	public boolean checkusername(String us, String pwd) {
	//		String query = "select * from loginpage.creds where uname=\"Yashwanth\" and pass=\"Yashwanth\"";
			String query = "select * from login where cred1=? and cred2=?";
			String url="jdbc:mysql://localhost:3306/yash"; //database is yash
			String username="root";
			String password="root";
		    try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = con.prepareStatement(query);
//				Statement st = con.createStatement();
				System.out.println(us);
				System.out.println(pwd);
				ps.setString(1, us);
				ps.setString(2, pwd);
				ResultSet rs = ps.executeQuery();
				
//				ResultSet rs = st.executeQuery(query);
				if(rs.next())
				{	
					System.out.println("Returning true from try block");
					return true;
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//				System.out.println("From CNF exp");
//				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("From SQL exp");
			}
			
		    
		    
		    
		    
		    
		    return false;
		

}
}
