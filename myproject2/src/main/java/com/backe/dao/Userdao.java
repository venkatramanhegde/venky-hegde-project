package com.backe.dao;

import java.util.List;

import com.backe.model.User;

public interface Userdao {
public void persist(User u);
	
	public void update(User u);
	
	public User  findById(int id);
	
	public void delete(User u);
	
	public List<User> getAllUsers();
	
	public void deleteAll();

}
