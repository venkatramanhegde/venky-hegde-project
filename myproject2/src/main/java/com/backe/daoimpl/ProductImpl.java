package com.backe.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backe.dao.ProductDao;
import com.backe.model.Product;

@Repository

public class ProductImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		System.out.println("session object created");
		this.sessionFactory = sf;
	}
	 
	
	public List<Product> getProductList() {
		
			
			/*Session sf =sessionFactory.openSession();
			sf.beginTransaction();
			Query query = sf.createQuery("from Product");
			List<Product> list2=query.list();
			System.out.println(list2);
			sf.getTransaction().commit();
				return list2;*/
		return null;
			
	}

}
