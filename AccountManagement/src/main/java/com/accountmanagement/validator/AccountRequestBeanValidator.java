package com.accountmanagement.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.accountmanagement.beans.AccountRequestBean;
import com.accountmanagement.repository.AccountRepository;

@Service
public class AccountRequestBeanValidator implements Validator{
	
	
	@Autowired
	private AccountRepository accountRepository;


	@Override
	public boolean supports(Class<?> clazz) {
		return AccountRequestBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors _errors) {
		AccountRequestBean accountRequestBeanRequest = (AccountRequestBean) target;
		
		
		if(accountRepository.findByAccountName(accountRequestBeanRequest.getAccountName().trim())!=null){
			_errors.reject("ACCOUNT NAME INVALID","ACCOUNT NAME ALREADY EXISTS");
		}
		
	
	}

}
