package main.java.com.cognizant.CogniCloth.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.CogniCloth.entityclasses.Cart;

public class CartDao {
@Autowired
private SessionFactory sessionfactory;

public Cart insert(Cart cart) throws Exception
{	Session session = this.sessionfactory.getCurrentSession();

	try {
		session.save(cart);
		return cart;
	}
	catch (HibernateException e)
	{
		throw new Exception("Cannot save cart",e);
	}
}
public void deletebyCartid(int id)
{
	Session session = this.sessionfactory.getCurrentSession();
	session.delete("from " + Cart.class.getName() + " where id = " + id);
	
}

public List<Cart> cartlist()
{
  Session session = this.sessionfactory.getCurrentSession();
  Query q = session.createQuery("from "+Cart.class.getName());
  List<Cart> cartlist = q.list();
  return cartlist;
	
}
 

}
	
	

