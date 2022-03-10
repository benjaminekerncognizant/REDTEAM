package com.cognizant.CogniCloth.jdbc;

import java.sql.Statement;

import com.cognizant.CogniCloth.DAo.ProductSearchDao;
import com.cognizant.CogniCloth.entityclasses.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JdbcProductSearch implements ProductSearchDao 
{	
	public void create(Product p)
	{
		
	}
	public void select(Product p) 
	{
		try 
			{ 
		    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cogniclothdb","root","root");
		    	String sql = "Select * from products";
		    	Statement smt = con.createStatement();
		    	ResultSet r = smt.executeQuery(sql);
	
		    	while (r.next())
		    	{
		    		int productID=r.getInt("productid");
		    		p.setProductID(productID);
				
					int supplierID=r.getInt("supplierid");
					p.setSupplierID(supplierID);
					
					long categoryID=r.getLong("categoryid");
					p.setCategoryID(categoryID);
					
					float price=r.getLong("unitprice");
					p.setPrice(price);
					
					String productName=r.getString("productname");
					p.setProductName(productName);
					
					String productDescription =r.getString("productdescription");
					p.setProductDescription(productDescription);
			}	
		}
	catch(SQLException e )
		{
		  e.printStackTrace();
		}

	}


	public void update(Product p)
	{
		
		
	}
		
	public void delete(Product p) {}

	}
	


