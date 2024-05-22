package com.sqlPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class JDBC_7 {
//update data in database
	public static void main(String[] args) {

		try {
			String url="jdbc:mysql://localhost:3306/JDBCPractise";
			String username="root";
			String password="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			System.out.println("Enter the name: ");
			String name=sc.next();
			System.out.println("Enter the city: ");
			String address=sc.next();
			
			Connection con=DriverManager.getConnection(url, username, password);
			//passing static values
			
			String str="update table1 set id=?,name=?,address=?";
			
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3, address);
			
			ps.executeUpdate();
			System.out.println("Modified....congratulations");
			con.close();
			sc.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Not inserted");
			System.out.println(e);
		}
	}

}
