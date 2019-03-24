package com.accountmanagement.service;

import org.springframework.stereotype.Service;

import com.accountmanagement.beans.AccountRequestBean;
import com.accountmanagement.beans.AccountResponseBean;

@Service
public interface CRUDOperationsHandler{
	
	public AccountResponseBean createAccount(AccountRequestBean _request);

	public AccountResponseBean removeAccount(String _accountDisplayId);
	
	

}
