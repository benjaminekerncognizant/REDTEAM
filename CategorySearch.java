package com.cognizant.CogniCloth;

import java.util.ArrayList;

public class CategorySearch {

private ArrayList<Category> categorylist = new ArrayList<Category>();
	
	
	public int getNumberofCategories()
	{
		return categorylist.size();
	}
	
	public Category getCategories()
	{
		for(Category c:categorylist)
		{
			return c;
		}
	
		return null;	
	}
	
}
