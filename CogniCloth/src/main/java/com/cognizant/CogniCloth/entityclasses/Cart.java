package main.java.com.cognizant.CogniCloth.entityclasses;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")

public class Cart {
	@Id
	
	@Column(name="cartid",length=20)
	private long Cartid;
	
	@Column(name="customerid")
	
	private long Customerid;
	
	@Column(name="orderid")
	private long Orderid;
	
	public long getOrderid() {
		return Orderid;
	}
	private final List<Cart> cartlist = new ArrayList<Cart>();

	public void setOrderid(long orderid) {
		Orderid = orderid;
	}
	    public List<Cart> getCarts()
	    {
	       return this.cartlist;
	    	
	    }
	private List<Product> myCart;
	
	public Cart() {}
	
	public long getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(long customerid) {
		Customerid = customerid;
	}

	public List<Product> getMyCart() {
		return myCart;
	}
	
	public void addToCart(Product p) {
		myCart.add(p);
	}
	
	public long getCartid() {
		return Cartid;
	}

	public void setCartid(long cartid) {
		Cartid = cartid;
	}

	public boolean removeFromCart(Product p) {
		return myCart.remove(p);
	}

	/*
	 * public static void main(String[] args) { Customer c1 = new Customer();
	 * System.out.println(c1.getCustomerID()); Customer c2 = new Customer();
	 * System.out.println(c2.getCustomerID()); }
	 */
}
