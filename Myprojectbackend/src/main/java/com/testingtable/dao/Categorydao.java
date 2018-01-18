package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Category;

public interface Categorydao {

	public List<Category> getAllCategories();
	 public void persist(Category c);
		
		     public void update(Category c);
		
		public Category  findById(int id);
		
		public void delete(Category c);
		
	//	public List<Category> getAllCategories();
		
		public void deleteAll();
	
}
