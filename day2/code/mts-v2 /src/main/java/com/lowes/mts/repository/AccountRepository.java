package com.lowes.mts.repository;

import com.lowes.mts.model.Account;

public interface AccountRepository {

	//
	Account findById(String num);
	void update(Account account);

	
}
