package com.accountmanagement.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmanagement.repository.AccountRepository;

@Service
public class GeneralUtil {

	@Autowired
	private AccountRepository accountRepository;

	public String createAccountDisplayId() {
		Long accountsCount = accountRepository.count();
		accountsCount++;
		return "ACCT1001" + accountsCount;

	}

}
