package com.testingtable.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="OID")
	 private int oid;
	// private User user;
	 
	 @Column(name="paytm")
	 int paytm;
	 
	 @Column(name="orderTotal") 
	 int orderTotal;
	 
	 public Order(int Oid,int paytm, int OrderTotal)
	 {
		 super();
		 this.oid=Oid;
		 //this.user=user;
		 this.paytm=paytm;
		 this.orderTotal=OrderTotal;
			 
	 }
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	public int getPaytm() {
		return paytm;
	}
	public void setPaytm(int paytm) {
		this.paytm = paytm;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	 

}
