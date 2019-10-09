package com.db.hackathon;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public  class PostgresSQLJDBC {
	public static void main(String args[]) {
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:postgresql://juggernauts.postgres.database.azure.com:5432/?user=admin1@juggernauts&password=&sslmode=require");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}
