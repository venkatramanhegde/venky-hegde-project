package com.testingtable.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class cart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	public String cartid;
	public String productid;
	public String Suplierid;
	public String userid;
	public String price;
	public String quantity;
	public String status;
	public String getCartid() {
		return cartid;
	
		
		
		
		@Id
		
		@GeneratedValue
		@Column(name="cartid")
		 
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getSuplierid() {
		return Suplierid;
	}
	public void setSuplierid(String suplierid) {
		Suplierid = suplierid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 

	
}
