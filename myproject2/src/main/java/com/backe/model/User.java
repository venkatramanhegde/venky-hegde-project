package com.backe.model;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
//implements Serializable
@Id
private int id;
private String name;
private String password;
private String email;
private String rol;
private String adress;
private String phone;
private boolean enable;


public User() {
	System.out.println("OBJECT IS CREATED");

	
	// TODO Auto-generated constructor stub
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
