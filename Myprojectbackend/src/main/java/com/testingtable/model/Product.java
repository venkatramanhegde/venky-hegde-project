package com.testingtable.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	       //@GeneratedValue(strategy = GenerationType.AUTO)
	int p_id;
	@Column(name="name")
	private String p_name;
	
	@Column(name="brand")
	private String p_brand;
	@Column(name="desc") 
	private String p_description;
	@Column(name="price")
	private int p_price;
	@Column(name="stock")
	private String stock;
	
	//@Column(name="quantity") private int p_quantity;
	@ManyToOne
	@JoinColumn(name="C_ID")
	Category category;
	@ManyToOne
	@JoinColumn(name="S_ID")
	Suplier suplier;
	@Column(name="image") 
	private String p_image;
	public Product() {
		super();
	}

	public Product(int p_id,String p_name, String p_brand,String p_description, int p_price,String stock,
			Category category, Suplier suplier, String p_image) {
		super();
		this.p_id = p_id;
		this.p_brand = p_brand;
		this.p_name = p_name;
		this.p_description = p_description;
		this.p_price = p_price;
		this.stock =stock;
		this.category = category;
		this.suplier = suplier;
		this.p_image = p_image;
	}
	
	public int getP_id() {
		return p_id;
	}
	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_brand() {
		return p_brand;
	}
	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_description() {
		return p_description;
	}
	public void setP_description(String p_description) {
		this.p_description = p_description;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	/*public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;}*/
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Suplier getSuplier() {
		return suplier;
	}
	public void setSuplier(Suplier suplier) {
		this.suplier = suplier;
	}
	public String getP_image() {
		return p_image;
	}
	public void setP_image(String p_image) {
		this.p_image = p_image;
	}
	
}
