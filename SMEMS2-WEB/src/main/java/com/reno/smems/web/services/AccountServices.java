package com.reno.smems.web.services;

import java.time.LocalDateTime;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.reno.smems.web.entities.Account;
import com.reno.smems.web.repositories.AccountRepository;

@LocalBean
@Stateless
public class AccountServices {
	
	@Inject
	private AccountRepository accountRepository;
	
	
	public void save(Account account) {
			account.setId(LocalDateTime.now().toString());
			accountRepository.save(account);
	}

}
