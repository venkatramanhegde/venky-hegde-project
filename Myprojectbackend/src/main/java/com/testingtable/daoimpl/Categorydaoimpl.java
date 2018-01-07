package com.testingtable.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testingtable.dao.Categorydao;
import com.testingtable.model.Category;

@Repository
public class Categorydaoimpl implements Categorydao {

@Autowired
private SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sf){
	this.sessionFactory = sf;
}

public void persist(Category c) 
{
	Session s=sessionFactory.openSession();
	s.beginTransaction();
	s.save(c);
	s.getTransaction().commit();
	s.close();
}
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		
	Session sf =sessionFactory.openSession();
	sf.beginTransaction();
	Query query = sf.createQuery("from Category");
	List<Category> list=query.list();
	System.out.println(list);
	sf.getTransaction().commit();
		return list;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	// TODO Auto-generated method stub
		}
/*
public void update(Category c) {
	// TODO Auto-generated method stub
	
}

public Category findById(int id) {
	Category c=(Category)sessionFactory.openSession().get(Category.class, id);
	// TODO Auto-generated method stub
	return c;
}

public void delete(Category c) {
	// TODO Auto-generated method stub
	
}



public void deleteAll() {
	// TODO Auto-generated method stub
	
}

*/

