package main.java.com.cognizant.CogniCloth.entityclasses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Category")
public class Category {
	
	@Id
	
	@Column(name="categoryid")
	private long categoryID;
	
	@Column(name="categoryname",length=40)
	private String categoryName;
	
	private static int currentID = 0;
	
	private static List<Category> allCategories = new ArrayList<Category>();
	
	public Category(String categoryName) {
		this.categoryID = ++currentID;
		this.categoryName = categoryName;
		allCategories.add(this);
	}
	
	public long getCategoryId() {
		return categoryID;
	}
	public void setCategoryId(long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public static String getCategoryName(long id) {
		for(Category c : allCategories) {
			if(id == c.categoryID)
				return c.categoryName;
		}
		return "None";
	}
	public static List<Product> searchByCategory(String categoryName) {
		List<Product> relevantProducts = new ArrayList<Product>();
		for(Product p : Product.getAllProducts()) {
			if(getCategoryName(p.getCategoryID()).contains(categoryName)) 
				relevantProducts.add(p);
		}
		return relevantProducts;
	}
}