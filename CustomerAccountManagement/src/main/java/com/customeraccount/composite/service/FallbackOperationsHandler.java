package com.customeraccount.composite.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.customeraccount.composite.beans.Account;
import com.customeraccount.composite.beans.Customer;
import com.customeraccount.composite.beans.CustomerAccountBean;

@Component
public interface FallbackOperationsHandler {
	
	public List<Account> getAllAccountsFallback();
	
	public List<Customer> getAllCustomersFallback();
	
	public List<CustomerAccountBean> getCustomerAccountDetailsFallback();

}
