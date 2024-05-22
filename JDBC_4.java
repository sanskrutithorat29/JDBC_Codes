package com.sqlPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class JDBC_4 {
//take input dynamically from user
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/JDBCPractise";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String str = "insert into table1(id,name) values (?,?); ";

			PreparedStatement ps = con.prepareStatement(str);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();

			ps.setInt(1, id);
			ps.setString(2, name);

			ps.executeUpdate();
			System.out.println("Inserted successfully");

			con.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

}
