package com.reno.smems.web.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.reno.smems.web.entities.Account;
import com.reno.smems.web.services.AccountServices;

@Named
@ViewScoped
public class ConfigAccountBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private AccountServices accountServices;
	
	
	private Account account;
	
	@PostConstruct
	public void intialize() {
		account=new Account();
	}
	
	public  void save() {
		accountServices.save(account);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	

}
