package com.cognizant.CogniCloth.DAo;

import com.cognizant.CogniCloth.entityclasses.Product;

public interface ProductSearchDao 
{
    public void create(Product ps);
	public void select(Product ps);
	public void update(Product ps);
	public void delete(Product ps);

}
