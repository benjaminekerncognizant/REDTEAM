package CogniCloth;

import java.util.List;
import java.util.Random;

public class Category {
	private long categoryID;
	private String categoryName;
	private static List<Integer> listOfIDs;
	
	public Category() {
		this.categoryID = generateID();
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

}