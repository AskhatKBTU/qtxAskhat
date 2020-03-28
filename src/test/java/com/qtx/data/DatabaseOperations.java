package com.qtx.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DatabaseOperations {
	String url = "jdbc:mysql://127.0.0.1:3306/sakila?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String userId = "root";
	String password = "Ikarus5588";
	Connection connection = null;

	public void canConnectToDatabase() throws SQLException {
		try {
			connection = DriverManager.getConnection(url, userId, password);

			if (connection == null) {
				throw new RuntimeException((new Exception("Failed to make connection!")));
			}
		}
		catch (SQLException e) {
			throw new RuntimeException(new Exception(String.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage())));
		} 
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	}
	
	@Test
	public void checkFilmIDandTitle() throws SQLException {

		String sql = "SELECT film_id, title FROM film WHERE title LIKE '%airplane%'";

	    try {
	    	connection = getDatabaseConnection();
	    	
	    	Statement statement = connection.createStatement();
	    	
	    	ResultSet resultSet = statement.executeQuery(sql);
	    	
          								
     
     		// While Loop to iterate through all data and print results		
			while (resultSet.next()){
		        		String id = resultSet.getString(1);								        
                        String title = resultSet.getString(2);					                               
                        System. out.println(id+" is an id for film: "+title);		
			}		
	    }
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	    
	}

	@Test
	public void workWithItem7() throws SQLException {
		
		int idInventory [] = { 73, 74, 75, 76};
		String sql = " SELECT inventory_id FROM inventory JOIN film USING (film_id) WHERE title = 'Alien Center' AND store_id='2'";

	    try {
	    	connection = getDatabaseConnection();
	    	
	    	Statement statement = connection.createStatement();
	    	
	    	ResultSet resultSet = statement.executeQuery(sql);
	    	
	    	
	    	for (int i = 0; i<idInventory.length; i++) {	
	    		resultSet.next();
	    		boolean check = false;
	    		if (idInventory[0] == 73) {
	    			check = true;
	    		}
	    		Assert.assertTrue(check, "Check check !!!");
	    	}
	    }
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	   
	}
	
	@Test
	public void insertIntoStaffTable() throws SQLException {

		String sql = "INSERT INTO sakila.staff (`staff_id`, `first_name`, `last_name`, `address_id`, `email`, `store_id`, `active`, `username`, `password`)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)"; 
	    
	    try {
	    	
	      	connection = getDatabaseConnection();
	      	
	        // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = connection.prepareStatement(sql);
		      preparedStmt.setInt (1, 6);
		      preparedStmt.setString (2, "Askhat");
		      preparedStmt.setString  (3, "Seitenov");
		      preparedStmt.setInt(4, 5);
		      preparedStmt.setString   (5, "AskhatSeitenov@gmail.com");
		      preparedStmt.setInt(6, 2);
		      preparedStmt.setInt(7, 1);
		      preparedStmt.setString(8, "Askhat");
		      preparedStmt.setString(9, "12345");
		      preparedStmt.execute();			                               	
	    }
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	    
	}
	
	@Test
	public void updateDateOnStaffTable() throws SQLException {
		
		String sql = "UPDATE store SET last_update=CURRENT_TIMESTAMP WHERE store_id='3'";

	    try {
	    	connection = getDatabaseConnection();
	    	
	    	Statement statement = connection.createStatement();	
	    	
	    	statement.executeUpdate(sql);
	    	
	    	System.out.println("Database updated successfully");
	    }
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	    
	    
	}
	
	@Test
	public void deleteFromStaffTable() throws SQLException {
	
		String sql = "DELETE from sakila.staff WHERE staff_id = ?";

	    try {
	    	
	    connection = getDatabaseConnection();	
	    
	    PreparedStatement pstmt = connection.prepareStatement(sql);
	   
	    pstmt.setInt(1, 5);;

	    	 	
	    }
		catch (Exception e) {
			throw new RuntimeException(e);
		} 
		finally {
			if(connection != null ) {
				connection.close();
			}
		}
	    
	}
	
	private Connection getDatabaseConnection() throws Exception {
		connection = DriverManager.getConnection(url, userId, password);

		if (connection == null) {
			throw new Exception("Failed to make connection!");
		}	

		return connection;
	}
}