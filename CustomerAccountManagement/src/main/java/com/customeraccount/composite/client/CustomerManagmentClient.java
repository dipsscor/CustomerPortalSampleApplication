package com.customeraccount.composite.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customeraccount.composite.beans.Customer;


@FeignClient("customer-management-service")
public interface CustomerManagmentClient {

	
	@RequestMapping(value = "/CUSTOMER-MANAGEMENT/V1.0/CUSTOMER/LIST", method = RequestMethod.GET)
	public List<Customer> getAllCustomers();

}