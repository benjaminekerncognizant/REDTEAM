package com.cognizant.CogniCloth;

public class CategorySearch extends Search {
	private String categoryDescription;
	private String categoryName;
	
	public String getCategoryDescription() {   
		return categoryDescription;
	}
	
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public CategorySearch(double price, String categoryId, String supplierId, String productId) {
		super(price, categoryId, supplierId, productId);
		// TODO Auto-generated constructor stub
	}
	
	public CategorySearch(double price, String categoryId, String supplierId, String productId,
			String categoryDescription, String categoryName) {
		super(price, categoryId, supplierId, productId);
		this.categoryDescription = categoryDescription;
		this.categoryName = categoryName;
	}
	
	
	
	
	

}
