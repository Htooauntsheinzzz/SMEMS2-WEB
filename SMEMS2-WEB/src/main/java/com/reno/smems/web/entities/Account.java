package com.reno.smems.web.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Lob;
@Entity
public class Account  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@javax.persistence.Id
	private String Id;
	
	private String name;
	
	private String phone;
	
	private String email;
	
	private String password;
	@Lob
	private String address;
	
	
	private boolean erase;


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isErase() {
		return erase;
	}


	public void setErase(boolean erase) {
		this.erase = erase;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
