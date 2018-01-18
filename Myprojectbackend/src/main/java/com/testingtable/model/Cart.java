package com.testingtable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity	
@Table(name="Cart")
public class Cart implements Serializable {

	
private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue
@Column(name="cartid")
     private int cartid;
	private Product productid;
	private Suplier suplierid;
	private User userid;
	private int prices;
	private int quantity;
	
	    
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}

	private String status;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	@OneToOne
	@JoinColumn(name="p_id")
	public Product getProductid() {
		return productid;
	}
	public void setProductid(Product productid) {
		this.productid = productid;
	}
	public Suplier getSuplierid() {
		return suplierid;
	}
	public void setSuplierid(Suplier suplierid) {
		this.suplierid = suplierid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
