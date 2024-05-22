package com.sqlPractice;

import java.sql.*;

public class JDBC_2 {
//create table using JDBC
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/JDBCPractise";
			String username = "root";
			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, username, password);
			
			String q="Create table table1(Id int(3) primary key not null, Name varchar(200), Address varchar(200))";
			
			Statement st=con.createStatement();
			st.executeUpdate(q);
			
			System.out.println("Table created in Database");
			
			con.close();
			
		} 
		
		catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(e);
		}
	}

}
