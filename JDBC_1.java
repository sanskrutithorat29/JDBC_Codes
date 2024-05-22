package com.sqlPractice;
import java.sql.*;
public class JDBC_1 {
//to check if connection is established or not
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/JDBCPractise";
			String username="root";
			String password="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else {
				System.out.println("Connection is open");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}

	}

}
