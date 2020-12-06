package com.reno.smems.web.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.reno.smems.web.entities.Account;

public class AccountRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Account account) {
		entityManager.persist(account);
	}
	

}
