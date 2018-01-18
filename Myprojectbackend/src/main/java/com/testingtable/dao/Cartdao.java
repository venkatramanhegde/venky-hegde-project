package com.testingtable.dao;

import java.util.List;

import com.testingtable.model.Cart;
import com.testingtable.model.Category;
import com.testingtable.model.Order;
import com.testingtable.model.Suplier;

public interface Cartdao {
	public void save(Cart cart);
    public Cart getId(int id);
	public void update(Cart cart);
	public void delete(Cart c);
	public List<Cart> getAll();
	public void persist(Cart c);
	public List<Cart> checkExistance(int t);
	public Cart findById(int id);
		
}
