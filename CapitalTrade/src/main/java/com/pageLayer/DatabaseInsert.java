package com.pageLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseInsert {

	public static void main(String[] args) {
		
//		// data
//				String emp_id = "1";
//				String emp_name = "Atul";
//				String emp_place = "Pune";
//				String emp_exp = "3";
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","system","system");
			
			Statement statement = connection.createStatement();
			
			//String query = "SELECT * FROM  employees WHERE Name='Atul' OR Exp = '3'";
			//String query = "SELECT*FROM Workers";
			String query = "SELECT Id,Name,Place,Exp FROM Workers";
			
			ResultSet rs = statement.executeQuery(query);
		
	// data validation	
		
		
			while(rs.next()) 
			{
				String id = rs.getString("1");
				String name = rs.getString("Atul");
				String place = rs.getString("Pune");
				String exp = rs.getString("3");
				
				System.out.println("Id " + id);
				System.out.println("Name " + name);
				System.out.println("place " + place);
				System.out.println("Exp " + exp);
				
			}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

		
		
	}

}


