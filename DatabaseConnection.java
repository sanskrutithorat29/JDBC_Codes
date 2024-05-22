package com.sqlPractice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String DATABASE_DRIVER="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/factory";
	private static final String DATABASE_USERNAME="root";
	private static final String DATABASE_PASSWORD="root";

	public static Connection getDatabaseConnection()
	{
		Connection connection=null;
		
		try
		{
			Class.forName(DATABASE_DRIVER);
			connection=DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}
}
