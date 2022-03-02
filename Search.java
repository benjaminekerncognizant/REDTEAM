package com.cognizant.CogniCloth;

public class Search {

	 private double price;
	    private String CategoryId;
	    private String supplierId;
       private String ProductId;
       
	 public Search(double price, String categoryId, String supplierId, String productId) {
		super();
		this.price = price;
		CategoryId = categoryId;
		this.supplierId = supplierId;
		ProductId = productId;
	}
	
	 public double getPrice() {
		return price;
	}
	
	 public void setPrice(double price) {
		this.price = price;
	}
	
	 public String getCategoryId() {
		return CategoryId;
	}
	
	 public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}
	
	 public String getSupplierId() {
		return supplierId;
	}
	
	 public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	 public String getProductId() {
		return ProductId;
	}
	
	 public void setProductId(String productId) {
		ProductId = productId;
	}
	
}
