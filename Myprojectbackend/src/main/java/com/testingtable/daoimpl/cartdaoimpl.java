package com.testingtable.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.testingtable.dao.cartdao;
import com.testingtable.model.Category;

public class cartdaoimpl implements cartdao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(cart ca) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(ca);
		s.getTransaction().commit();
		s.close();
	}
		public List<cart>  getAllcarts() {
			// TODO Auto-generated method stub
			
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from Cart");
		List<cart> list=query.list();
		System.out.println(list);
		sf.getTransaction().commit();
			return list;
		}

		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

}
