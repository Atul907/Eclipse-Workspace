package com.pageLayer;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseTesting {

	public static void main(String[] args) {
		
		//database connection
		
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","system","system");
			
			Statement statement = connection.createStatement();
			
			//String query = "SELECT * FROM  employees WHERE Name='Atul' OR Exp = '3'";
			String query = "CREATE TABLE Work (Id int, Name VARCHAR2 (20), Place VARCHAR2 (20), Exp int )";
			
			//ResultSet rs = statement.executeQuery(query);
			statement.executeQuery(query);
			
			System.out.println("table created succesfully....");
			
			connection.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
