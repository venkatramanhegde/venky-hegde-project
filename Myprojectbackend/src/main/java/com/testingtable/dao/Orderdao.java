package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Category;
import com.testingtable.model.Order;

public interface Orderdao {
	
	 public void persist(Order o);
		
		public void update(Order o);
		
		public Category  findById(int id);
		
		public void delete(Order o);
		
		public List<Order> getAllOrder();
		
		public void deleteAll();
	

}
