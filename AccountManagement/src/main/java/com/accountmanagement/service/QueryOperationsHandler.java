package com.accountmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accountmanagement.model.Account;

@Service
public interface QueryOperationsHandler{
	
	public List<Account> getAllAccounts();
	
	public Account getAccountByDisplayId(String _accountDisplayId);
	
	public List<Account> searchAccounts(String _accountDisplayId,String _customerDisplayId);
	
	public List<Account> getAccountByCustomerDisplayId(String _customerDisplayId);
	

}
