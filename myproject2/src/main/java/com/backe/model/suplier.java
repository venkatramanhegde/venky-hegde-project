package com.backe.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.hibernate.mapping.Selectable;
import org.springframework.stereotype.Component;

@Component
@Entity
public class suplier {//implements Selectable {
   @Id
   private int sid;
   private String Sname;
   private Set<Product> product =new HashSet<Product>(0);
public suplier() {

	// TODO Auto-generated constructor stub
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public Set<Product> getProduct() {
	return product;
}
public void setProduct(Set<Product> product) {
	this.product = product;
}
   
}
