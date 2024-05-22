package com.sqlPractice;

import java.sql.Connection;
import java.sql.SQLException;

public class InsertDemo
{

	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		try 
		{

			connection = DatabaseConnection.getDatabaseConnection();
			
			if(connection != null)
			{
				System.out.println("Database connection Successfully");
			}
			else
			{
				System.out.println("Unable to connect database");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		finally
		{
			connection.close();
		}

	}

}
