package com.reno.smems.web.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class SignInBean  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String message;
	
	
	public void  signIn() {
	 
		if(username.equals("Admin" )) {
			if(password.equals("admin")) {
			 message="Login Success";
			}else {
			 message="Password Incorrrect";
			}
	}else if (password.equals("admin")) {
			message="Username Incorrect";
	}
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


}
