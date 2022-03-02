package com.cognizant.CogniCloth;

public class Search {

	 private double price;
	    private long CategoryId;
	    private long supplierId;
       private long ProductId;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(long categoryId) {
		CategoryId = categoryId;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public long getProductId() {
		return ProductId;
	}
	public void setProductId(long productId) {
		ProductId = productId;
	}
	public Search(double price, long categoryId, long supplierId, long productId) {
		super();
		this.price = price;
		CategoryId = categoryId;
		this.supplierId = supplierId;
		ProductId = productId;
	}
       
}