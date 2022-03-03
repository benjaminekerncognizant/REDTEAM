package com.cognizant.CogniCloth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcProductSearch implements ProductSearchDao 
{
	DBConnection db = new DBConnection();
	private Connection con;
	
	public void select(ProductSearch ps) 
	{
		String Sql ="SELECT p.productname,p.productid from product p";
	try {
			PreparedStatement Prepare =con.prepareStatement(Sql);
		
			Prepare.setString(1, ps.getProductName());
			Prepare
		
			Prepare.executeUpdate();
			Prepare.close();
			
		}
	
	
	
		
		
	}
	

	

}
