package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Suplier;

public interface Suplierdao {
	 public void persist(Suplier s);
	 public List<Suplier> getAllSupliers();
	 public Suplier  findById(int id);
		
		
	/*	public void update(Supplier s);
		
		
		public void delete(Supplier s);
		
		public List<Supplier> getAllSuppliers();
		
		public void deleteAll();
	*/

}
