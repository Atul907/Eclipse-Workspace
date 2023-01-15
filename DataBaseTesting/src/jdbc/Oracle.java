package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Oracle {

	public static void main(String[] args) throws Exception {
		
		
			try {
				
				DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
				
				//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","system","system");
			
			Statement statement = connection.createStatement();
			
			//String query = "SELECT * FROM  employees WHERE Name='Atul' OR Exp = '3'";
			//String query = "SELECT*FROM Workers";
			
			ResultSet rs = statement.executeQuery("SELECT*FROM Workers");
		
	// data validation	
		
		
			while(rs.next()) 
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String place = rs.getString(3);
				int exp = rs.getInt(4);
				
				System.out.println("Id " + id);
				System.out.println("Name " + name);
				System.out.println("place " + place);
				System.out.println("Exp " + exp);
				
			}
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
