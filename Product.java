package com.cognizant.CogniCloth;

import java.util.List;
import java.util.Random;

public class Product {
	
	private int productID;
	private int supplierID;
	private float price;
	private String productName;
	private String productDescription;
	private static List<Integer> listOfIDs;

	public Product() {
		this.productID = generateID();
	}
	
	public static int generateID() {
		if(listOfIDs.size() > 999999) {
			System.out.println("Error: too many ids");
			return -1;
		}
		int randInt;
		Random rand = new Random();
		while(listOfIDs.size() >= 0) {
			randInt = rand.nextInt(1000000);
			if(! listOfIDs.contains(randInt)) {
				listOfIDs.add(randInt);
				return randInt;
			}
		}
		return -1;
	}
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
