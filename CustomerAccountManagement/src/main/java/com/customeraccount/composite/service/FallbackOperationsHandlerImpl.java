package com.customeraccount.composite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.customeraccount.composite.beans.Account;
import com.customeraccount.composite.beans.Customer;
import com.customeraccount.composite.beans.CustomerAccountBean;

@Service
public class FallbackOperationsHandlerImpl implements FallbackOperationsHandler{

	@Override
	public List<Account> getAllAccountsFallback() {
		
		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account();
		account.setAccountDisplayId("ACCT10100");
		account.setAccountName("Circuit Breaker Fallback Account");
		account.setCustomerDisplayId("C9010");
		accounts.add(account);
			return accounts;

	}

	@Override
	public List<Customer> getAllCustomersFallback() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setCustomerName("Demo Customer showing fallback");
		customers.add(customer);
		return customers;
	}

	@Override
	public List<CustomerAccountBean> getCustomerAccountDetailsFallback() {
		List<CustomerAccountBean> customerAccounts = new ArrayList<CustomerAccountBean>();
		
		CustomerAccountBean customerAccountBean = new CustomerAccountBean();
		customerAccountBean.setCustomerName("Demo Customer Account showing fallback");
		customerAccounts.add(customerAccountBean);
		return customerAccounts;
	}

}
