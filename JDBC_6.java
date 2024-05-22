package com.sqlPractice;

import java.sql.DriverManager;
import java.io.FileInputStream;
import java.sql.*;
public class JDBC_6 {
//inserting second image
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/JDBCPractise";
			String password="root";
			String username="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, username, password);
			String q="insert into pics(images) values (?)";
			
			PreparedStatement ps=con.prepareStatement(q);
			FileInputStream fs=new FileInputStream("D:\\Fusion Institute\\JDBC_Code\\src\\com\\sqlPractice\\DSC_3197.JPG");
			ps.setBinaryStream(1, fs,fs.available());
			
			
			ps.execute();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			System.out.println(e);
		}
	}

}
