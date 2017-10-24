package com.lowes.mts.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lowes.mts.model.Account;

//@Component("jpaAccRepo")
@Repository("jpaAccRepo")
public class JpaAccountRepositoryImpl implements AccountRepository {


	public Account findById(String num) {
		return null;
	}

	public void update(Account account) {
	}

}
