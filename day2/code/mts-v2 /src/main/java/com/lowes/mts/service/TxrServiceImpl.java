package com.lowes.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lowes.mts.model.Account;
import com.lowes.mts.repository.AccountRepository;

//@Component("txrService")
@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	@Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	// AOP

	@Transactional(rollbackFor = RuntimeException.class)
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		System.out.println("Txr..");

		// Load From & To -Accounts

		Account fromAccount = accountRepository.findById(fromAccNum);
		Account toAccount = accountRepository.findById(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update both accounts
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		System.out.println("Txr success");

		return true;
	}

}
