package com.cognizant.CogniCloth.DAo;

import com.cognizant.CogniCloth.entityclasses.Category;

public interface CategorySearchDao {
	
	public void create(Category cs);
	public void select(Category cs);
	public void update(Category cs);
	public void delete(Category cs);
	
}
 