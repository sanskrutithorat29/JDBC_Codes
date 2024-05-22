package com.sqlPractice;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_5 {

	public static void main(String[] args) {
//insert small images in database less than 65KB
		try {
			String url = "jdbc:mysql://localhost:3306/JDBCPractise";
			String password="root";
			String username="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, username, password);
			String q="insert into pics(image) values (?)";
			
		PreparedStatement ps=con.prepareStatement(q);
		
		FileInputStream fs=new FileInputStream("D:\\Fusion Institute\\JDBC_Code\\src\\com\\sqlPractice\\doremon.jpg");
		ps.setBinaryStream(1, fs, fs.available());
		ps.executeUpdate();
		
		System.out.println("Inserted the image");
		
	con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}

}
