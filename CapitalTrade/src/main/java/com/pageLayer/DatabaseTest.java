package com.pageLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

public static void main(String[] args) throws SQLException    {
	
	// data
		String emp_name = "Atul";
		String emp_id = "1";
		String emp_place = "Pune";
		String emp_exp = "3";
	
	
	// Database connection
	
		Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","system","system");
		
		Statement statement = connection.createStatement();
		
		//String query = "SELECT * FROM  employees WHERE Name='Atul' OR Exp = '3'";
		String query = "Select Id,Name, Place, Exp from Workers";
		
		ResultSet rs = statement.executeQuery(query);
		
	// data validation	
		
		boolean status = false;
		System.out.println(status);
		while(rs.next()) 
		{
			String id = rs.getString("Id");
			String name = rs.getString("Name");
			String place = rs.getString("Place");
			String exp = rs.getString("Exp");
			
			
		if(emp_id.equals(id) && emp_name.equals(name) && emp_place.equals(place) && emp_exp.equals(exp))
		{
			System.out.println("record found in table || test passed");
			status=true;
			break;
		}
			
		}
	
		if(status=false)
		{
			System.out.println("record not found in table || test Failed");
		}
		
	}
	
}
