package com.testingtable.daoimpl;

import java.util.List;
import java.util.function.Supplier;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testingtable.dao.Suplierdao;
import com.testingtable.model.Suplier;

@Repository
public class Suplierdaoimpl implements Suplierdao{
	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	public void persist(Suplier sup) {
		
		Session f=sessionFactory.openSession();
		f.beginTransaction();
		f.save(sup);
		f.getTransaction().commit();
		f.close();
	}
		// TODO Auto-generated method stub
		public List<Suplier> getAllSupliers() {
			// TODO Auto-generated method stub
			
			Session sf =sessionFactory.openSession();
			sf.beginTransaction();
			Query query = sf.createQuery("from Suplier");
			List<Suplier> list1=query.list();
			System.out.println(list1);
			sf.getTransaction().commit();
				return list1;
			}
			
		
		
		
	


	public void update(Suplier s) {
		// TODO Auto-generated method stub
		
	}

	public Suplier findById(int id) {
		Suplier s=(Suplier)sessionFactory.openSession().get(Suplier.class, id);
		// TODO Auto-generated method stub
		return  s;
	}

	public void delete(Suplier s) {
		// TODO Auto-generated method stub
		
	}

	public List<Suplier> getAllSupliers1() {
		// TODO Auto-generated method stub
		
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from Supplier");
		List<Suplier> list1=query.list();
		System.out.println(list1);
		sf.getTransaction().commit();
			return list1;
		}
		
	
	

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}



