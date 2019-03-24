package com.customeraccount.composite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customeraccount.composite.beans.Account;
import com.customeraccount.composite.beans.Customer;
import com.customeraccount.composite.beans.CustomerAccountBean;
import com.customeraccount.composite.client.AccountManagementClient;
import com.customeraccount.composite.client.CustomerManagmentClient;
@Service
public class OperationsHandlerImpl implements OperationsHandler{
	
	@Autowired
	private CustomerManagmentClient customerManagmentClient;
	
	@Autowired
	private AccountManagementClient accountManagementClient;
	
	
	
	
	@Override
	public List<CustomerAccountBean> getCustomerAccountDetails() {
		List<CustomerAccountBean> responseBeans = new ArrayList<CustomerAccountBean>();
		
		List<Customer> customers = customerManagmentClient.getAllCustomers();
		for(Customer customer:customers){
			CustomerAccountBean responseBean = new CustomerAccountBean();
			List<Account> accounts = accountManagementClient.getAccountByDisplayId(null, customer.getCustomerDisplayId().trim());
			responseBean.setAccounts(accounts);
			responseBean.setCustomerName(customer.getCustomerName());
			responseBean.setCustomerEmailAddress(customer.getEmailAddress());
			responseBeans.add(responseBean);
		}
		return responseBeans;
	}



	@Override
	public List<Customer> getAllCustomers() {
		return customerManagmentClient.getAllCustomers();
	}


	@Override
	public List<Account> getAllAccounts() {
		return accountManagementClient.getAllAccounts();
	}
}