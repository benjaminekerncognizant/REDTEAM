package main.java.com.cognizant.CogniCloth.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.CogniCloth.entityclasses.Category;


public class CategoryDao {
	@Autowired
	private SessionFactory sessionfactory;
	
	public Category getName(String title)
	{
      Session session = this.sessionfactory.getCurrentSession();
	  String sql="select c.CategoryName from "+Category.class.getName()+"c";
	  Query<Category> q = session.createQuery(sql,Category.class);
	  Category category = q.uniqueResult();
	  return category;
	}
	
	public List<Category> categorylist()
	{
	  Session session = this.sessionfactory.getCurrentSession();
	  String sql="select *from"+Category.class.getName();
	  Query q = session.createQuery(sql,Category.class);
	  List<Category> catlist = q.list();
	  return catlist;
	}	
	 
   public void updateCategory(Category category)
   {
		  Session session = this.sessionfactory.getCurrentSession();
		  session.update(category);	 
   }
}