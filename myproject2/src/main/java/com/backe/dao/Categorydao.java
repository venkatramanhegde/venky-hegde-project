package com.backe.dao;

import java.util.List;
import java.util.Locale.Category;

import com.backe.model.category;

public interface Categorydao {
public  void persist(Category p);
	
	public void update(category p);
	
	public category  findById(int cid);
	
	public void delete(category p);
	
	public List<category> getAllcategory();
	
	public void deleteAll();
   
    public List<category> getFiltercategory(int C_ID);
}
