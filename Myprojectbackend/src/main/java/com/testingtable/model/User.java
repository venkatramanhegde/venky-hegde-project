package com.testingtable.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

//package com.backe.model;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.stereotype.Component;

//@Component
@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Basic(optional=false)
@Column(name="ID")
private int id;

@Column(name="NAME")
private String name;

@Column(name="PASSWORD")
private String password;

@Column(name="EMAIL")
private String email;

@Column(name="ROL")
private String rol;

@Column(name="ADRESS")
private String adress;

@Column(name="PHONE")
private String phone;

@Column(name="ENABLE")
private boolean enable;


public User() {
	System.out.println("OBJECT IS CREATED");

	
	}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getRol() {
	return rol;
}


public void setRol(String rol) {
	this.rol = rol;
}


public String getAdress() {
	return adress;
}


public void setAdress(String adress) {
	this.adress = adress;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public boolean isEnable() {
	return enable;
}


public void setEnable(boolean enable) {
	this.enable = enable;
}



}




















