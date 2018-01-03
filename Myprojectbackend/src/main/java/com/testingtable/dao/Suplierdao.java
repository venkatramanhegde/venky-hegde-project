package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Supplier;

public interface Suplierdao {
	 public void persist(Supplier s);
		
		public void update(Supplier s);
		
		public Supplier  findById(int id);
		
		public void delete(Supplier s);
		
		public List<Supplier> getAllSuppliers();
		
		public void deleteAll();
	

}
