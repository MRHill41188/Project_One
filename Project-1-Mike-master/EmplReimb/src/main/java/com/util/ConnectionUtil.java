package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtil {

public static Connection getConnection() {

	String url = "jdbc:postgresql://project1db.clcnvzawjmzr.us-east-2.rds.amazonaws.com:5432/postgres";
	String uname = System.getenv("JDBC_ROLE");
	String pword = System.getenv("JDBC_PASSWORD1");

	try {
		System.out.println("Trying to connect to the database...");
		return DriverManager.getConnection(url, uname, pword);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	
}