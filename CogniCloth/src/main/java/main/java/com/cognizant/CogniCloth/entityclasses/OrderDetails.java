package main.java.com.cognizant.CogniCloth.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")

public class OrderDetails {
	
	@Id
	
	@Column(name="orderid")
	private int orderID;
	
	@Column(name="productid")
	private int productID;
	
	@Column(name="quantity")
	private int quantity;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
