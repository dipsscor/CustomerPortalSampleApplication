package com.customeraccount.composite.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.customeraccount.composite.beans.Account;


@FeignClient("account-management-service")
public interface AccountManagementClient {
	
	@RequestMapping(value = "/ACCOUNT-MANAGEMENT/V1.0/ACCOUNT/LIST", method = RequestMethod.GET)
	public List<Account> getAllAccounts();
	
	@RequestMapping(value = "/ACCOUNT-MANAGEMENT/V1.0/ACCOUNT/SEARCH", method = RequestMethod.GET)
	public List<Account> getAccountByDisplayId(@RequestParam(name="accountDisplayId",required=false) String _accountDisplayId,
			@RequestParam(name="customerDisplayId",required=false) String _customerDisplayId);
}
