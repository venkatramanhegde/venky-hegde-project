package com.testingtable.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testingtable.dao.Userdao;
import com.testingtable.model.User;
@Repository

public class Userdaoimpl implements Userdao {

			@Autowired
		private SessionFactory sessionFactory;
		 
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
		 
		public void persist(User U) 
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(U);
			s.getTransaction().commit();
			s.close();
			
			}

		/*public void update(User U) 
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.update(U);
			s.getTransaction().commit();
			s.close();
			// TODO Auto-generated method stub
			
		}

		public User findById(int id) {
			// TODO Auto-generated method stub
			return (User)sessionFactory.openSession().get(User.class,id);
		
		}

		public void delete(User U) {
			// TODO Auto-generated method stub
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.delete(U);
			s.getTransaction().commit();
			s.close();sessionFactory.openSession().delete(U);
		}

		public List<User> getAllProducts() {
			
			Session sf =sessionFactory.openSession();
			sf.beginTransaction();
			Query query = sf.createQuery("from User");
			List<User> list2=query.list();
			System.out.println(list2);
			System.out.println(list2);
			sf.getTransaction().commit();
				return list2;
			}

		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		public List<Product> getFilterProducts(int C_ID) {
			// TODO Auto-generated method stub
	        Session s=sessionFactory.openSession();
			List<User> results =s.createQuery("from Product where c_id="+C_ID).list();
			s.close();
			return results;
		}*/
		
}
