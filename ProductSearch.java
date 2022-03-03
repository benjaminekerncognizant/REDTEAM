package com.cognizant.CogniCloth;

import java.util.ArrayList;

public class ProductSearch{
	private ArrayList<Product> productlist = new ArrayList<Product>();
	
	ProductSearch (){}
	
	public int getNumberofProduct()
	{
		return productlist.size();
	}
	
	public Product getProducts()
	{
		for(Product p: productlist)
		{
			return p;
		}
	
		return null;	
	}
}	