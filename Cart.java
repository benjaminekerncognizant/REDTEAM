package com.cognizant.CogniCloth;

import java.util.List;

public class Cart {
	private List<Product> myCart;
	
	public Cart() {}
	
	public List<Product> getMyCart() {
		return myCart;
	}
	
	public void addToCart(Product p) {
		myCart.add(p);
	}
	
	public boolean removeFromCart(Product p) {
		return myCart.remove(p);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println(c1.getCustomerID());
		Customer c2 = new Customer();
		System.out.println(c2.getCustomerID());
	}
}
