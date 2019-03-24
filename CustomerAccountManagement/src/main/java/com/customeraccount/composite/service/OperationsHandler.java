package com.customeraccount.composite.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.customeraccount.composite.beans.Account;
import com.customeraccount.composite.beans.Customer;
import com.customeraccount.composite.beans.CustomerAccountBean;

@Component
public interface OperationsHandler {
	
	public List<Customer> getAllCustomers();
	
	public List<Account> getAllAccounts();
	
	public List<CustomerAccountBean> getCustomerAccountDetails();

}
