package com.cognizant.CogniCloth;

import java.util.List;
import java.util.Random;

public class Category {
	private long CategoryId;
	private String CategoryName;
	private static List<Integer> listOfIDs;
	
	public Category() {
		this.CategoryId = generateID();
	}
	
	public static int generateID() {
		if(listOfIDs.size() > 50000) {
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
		
	
	public long getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(long categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

}
