package com.jspmaven.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public void SetAlien(int aid, String name, String tech) {
		
		Alien a = new Alien();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Aliens","root","root");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("insert into details values(?,?,?)");
			ps.setInt(1, aid);
			ps.setString(2,name);
			ps.setString(3, tech);
			int rs=ps.executeUpdate();
//			System.out.println("insert into details values(aid,name,tech)");

			System.out.println("Updated "+rs+" rows");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
