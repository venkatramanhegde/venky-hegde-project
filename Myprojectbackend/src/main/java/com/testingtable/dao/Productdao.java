package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Product;

public interface Productdao {
public void persist(Product p);

public List<Product> getAllProducts();

	
	/*public void update(Product p);
	
	public Product  findById(int id);
	
	public void delete(Product p);
	
	
	
	public void deleteAll();
   */
    public List<Product> getFilterProducts(int  c_id);
    
}
