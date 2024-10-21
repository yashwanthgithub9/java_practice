package com.jspmaven.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class AlienDAO {
	
	public Alien GetAlien(int id) {
		
		Alien a = new Alien();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Aliens","root","root");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from details where aid="+id);
			if (rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setName(rs.getString("name"));
				a.setTech(rs.getString("tech"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		return a;
		
	}

}
