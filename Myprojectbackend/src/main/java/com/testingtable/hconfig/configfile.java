package com.testingtable.hconfig;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.testingtable.model.Category;
import com.testingtable.model.Product;
import com.testingtable.model.Suplier;
import com.testingtable.model.User;



@Configuration
@ComponentScan("com.testingtable")
@EnableTransactionManagement
public class configfile
{
	
	    @Autowired
	    @Bean
	    public SessionFactory sessionFactory(DataSource datasource) {
	        LocalSessionFactoryBuilder sessionBuilder  = new LocalSessionFactoryBuilder(datasource);
	        sessionBuilder.setProperty("hibernate.show_sql", "true");
	        
	        sessionBuilder.addProperties(getHibernateProperties());
	        sessionBuilder.addAnnotatedClass(User.class);
	        sessionBuilder.addAnnotatedClass(Category.class);
	        sessionBuilder.addAnnotatedClass(Suplier.class);
	        sessionBuilder.addAnnotatedClass(Product.class);
	        //sessionBuilder.addAnnotatedClass(Orders.class);
	       sessionBuilder.addAnnotatedClass(cart.class);
	        return sessionBuilder.buildSessionFactory();
	    }
	    @Autowired
	    @Bean(name = "datasource")
	    public DataSource dataSource()
	    {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("org.h2.Driver");
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/venkat");

	        dataSource.setUsername("sa");
	        dataSource.setPassword("");
	        return dataSource;
	    }

	    private Properties getHibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.show_sql", "true");
	        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	        properties.put("hibernate.format_sql", "true");
	        properties.put("hibernate.hbm2ddl.auto", "create");
	        properties.put("hibernate.connection.autocommit", true);
	        return properties;
	    }
	    @Bean
		@Autowired
	        public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
	                return new HibernateTransactionManager(sessionFactory);
	        }

	  
	    @Bean HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory);

	        return transactionManager;
	    }

	

	   
}