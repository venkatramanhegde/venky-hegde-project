package com.testingtable.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testingtable.dao.Productdao;
import com.testingtable.model.Product;

@Repository
public class Productdaoimpl implements Productdao {
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	 
	public void persist(Product p) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
		
		}
	public List<Product> getAllProducts() {
		
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from Product");
		List<Product> list2=query.list();
		System.out.println(list2);
		System.out.println(list2);
		sf.getTransaction().commit();
			return list2;
		}
	

/*	public void update(Product p) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
		s.close();
		// TODO Auto-generated method stub
		
	}

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return (Product)sessionFactory.openSession().get(Product.class,id);
	
	}

	public void delete(Product p) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();sessionFactory.openSession().delete(p);
	}



	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getFilterProducts(int C_ID) {
		// TODO Auto-generated method stub
        Session s=sessionFactory.openSession();
		List<Product> results =s.createQuery("from Product where c_id="+C_ID).list();
		s.close();
		return results;
	}
	*/
		
		
}


