package main.java.com.cognizant.CogniCloth.jdbc;

import java.sql.Statement;
import main.java.com.cognizant.CogniCloth.dao.CategorySearchDao;
import main.java.com.cognizant.CogniCloth.entityclasses.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCategorySearch implements CategorySearchDao
{

	public void create(Category c)
	{
		
	}
	public void select(Category c)
	{
		try 
		{    
		        Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName LIKE %" + c.getCategoryName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
	
			while (r.next()) {
				long categoryID = r.getLong("categoryid");
				String categoryName = r.getString("categoryName");
				sb.append(categoryName);
				sb.append(", ");
		  	}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		  }
		catch(SQLException e )
		{
		  e.printStackTrace();
		}
	}

	public void update(Category c) {
			
	}
		
	//Delete any items from selected category + deletes category itself
	public void delete(Category c) {
		try 
		{    
		        Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "DELETE * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName LIKE %" + c.getCategoryName() + "%";
			smt.executeQuery(sql);
			sql = "DELETE * FROM Category WHERE categoryName LIKE %" + c.getCategoryName() + "%";
			smt.executeQuery(sql);
		  }
		catch(SQLException e )
		{
		  e.printStackTrace();
		}
	}
	
	//Selects all products that are not in the selected category
	public void remove(Category c) {
		try 
		{    
		        Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName NOT LIKE %" + c.getCategoryName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
	
			while (r.next()) {
				long categoryID = r.getLong("categoryid");
				String categoryName = r.getString("categoryName");
				sb.append(categoryName);
				sb.append(", ");
		  	}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		  }
		catch(SQLException e )
		{
		  e.printStackTrace();
		}
	}
}
 
