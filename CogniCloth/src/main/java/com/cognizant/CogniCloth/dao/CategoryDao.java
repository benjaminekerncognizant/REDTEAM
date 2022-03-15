package main.java.com.cognizant.CogniCloth.dao;

import org.hibernate.SessionFactory;

import main.java.com.cognizant.CogniCloth.entityclasses.Category;

@Autowired
public class CategoryDao {
	SessionFactory sessionfactory = new SessionFactory();
	public Category getName(String title)
	{
	  String sql="select c.CategoryName from "+Category.class.getName()+"c";
	  
	  
	  
	

}
