package com.JdbcDemos;

import java.sql.*;
import java.util.Scanner;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Driver;
//import com.mysql.jdbc.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GetConnectionToDb gt = new GetConnectionToDb();
		GetQuery gq = new GetQuery();
		GetUpdate gu = new GetUpdate();
		gq.query("select * from matches");
//		System.out.print("Enter Home Team : ");
//		Scanner sc = new Scanner(System.in);
//		String home= sc.next();
//		System.out.print("Enter date in yyyy-mm-dd format : ");
//		String d= sc.next();
//		System.out.print("Enter Opponent Team : ");
//		String opp= sc.next();

//		gu.update("insert into matches values(\"RR\",\"2024-08-10\",\"SRH\")");	
//		gu.update("insert into matches values(\"+home+\",\"+d+","+opp+")");
//		gq.query("select * from matches");
		gu.update("insert into matches values(?,?,?)");
		gq.query("select * from matches");

	}

}
