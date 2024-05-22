package com.sqlPractice;
import java.sql.*;
public class JDBC_3 {
//insert data into table
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/JDBCPractise";
			String username="root";
			String password="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, username, password);
			//passing static values
			
			String str="insert into table1(Id,Name,Address) values ('9','Pappa','Nashik')";
			
		// passing  dynamic values
		/*
		 * String str="insert into table1(Id,Name) values (?,?)";
		 * 
		 * PreparedStatement ps=con.prepareStatement(str);
		 * 
		 * ps.setString(2, "Duggi"); ps.setString(3, "Janu");
		 */
			PreparedStatement ps=con.prepareStatement(str);
			ps.executeUpdate();
			System.out.println("Inserted");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Not inserted");
			System.out.println(e);
		}
	}
}

