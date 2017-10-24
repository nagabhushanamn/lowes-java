package com.lowes.mts.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lowes.mts.model.Account;

//@Component("jpaAccRepo")
@Repository("jpaAccRepo")
public class JpaAccountRepositoryImpl implements AccountRepository {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager em;

	public Account findById(String num) {
		return em.find(Account.class, num);
	}

	public void update(Account account) {
		em.merge(account);
	}

}
