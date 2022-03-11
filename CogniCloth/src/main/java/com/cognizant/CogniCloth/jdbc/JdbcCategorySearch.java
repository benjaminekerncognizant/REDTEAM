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
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cogniclothdb","root","root");
			String sql = "Select * from categories";
			Statement smt = con.createStatement();
			ResultSet r = smt.executeQuery(sql);
	
			while (r.next())
		    {
				long categoryID=r.getLong("categoryid");
				c.setCategoryId(categoryID);
				
				String categoryName=r.getString("categoryname");
				c.setCategoryName(categoryName);
		     }
		  }
	catch(SQLException e )
		{
		  e.printStackTrace();
		}
	}

	public void update(Category c){}
		
	public void delete(Category c) {}
}
 