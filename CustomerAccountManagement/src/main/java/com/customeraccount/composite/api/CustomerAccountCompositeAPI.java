package com.customeraccount.composite.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customeraccount.composite.beans.Account;
import com.customeraccount.composite.beans.Customer;
import com.customeraccount.composite.beans.CustomerAccountBean;
import com.customeraccount.composite.client.AccountManagementClient;
import com.customeraccount.composite.client.CustomerManagmentClient;
import com.customeraccount.composite.service.CustomerAccountManagementProcessor;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/CUSTOMER-ACCOUNT-COMPOSITE/V1.0")
// Swagger Specific Annotations
@Api(value = "CUSTOMER ACCOUNT COMPOSITE", description = "CUSTOMER ACCOUNT COMPOSITE")
public class CustomerAccountCompositeAPI {

	private static final Logger logger = Logger.getLogger(CustomerAccountCompositeAPI.class.getName());

	@Autowired
	private CustomerManagmentClient customerManagmentClient;

	@Autowired
	private AccountManagementClient accountManagementClient;

	@Autowired
	CustomerAccountManagementProcessor customerAccountManagementProcessor;

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "LIST ALL CUSTOMERS")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMERS/LIST", method = RequestMethod.GET, produces = { "application/json" })
	// Hystrix Configuration
	@HystrixCommand(fallbackMethod = "getAllCustomersFallback")
	public ResponseEntity<List<Customer>> getAllCustomers() {

		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getAllCustomers(), Message: Processing Request");
		return new ResponseEntity<List<Customer>>(
				customerAccountManagementProcessor.getOperationsHandler().getAllCustomers(), HttpStatus.OK);
	}

	public ResponseEntity<List<Customer>> getAllCustomersFallback() {
		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getAllCustomersFallback(), Message: Processing Request");
		return new ResponseEntity<List<Customer>>(
				customerAccountManagementProcessor.getFallbackOperationsHandler().getAllCustomersFallback(),
				HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "LIST ALL ACCOUNTS")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/ACCOUNT/LIST", method = RequestMethod.GET, produces = { "application/json" })
	// Hystrix Configuration
	@HystrixCommand(fallbackMethod = "getAllAccountsFallback")
	public ResponseEntity<List<Account>> getAllAccounts() {
		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getAllAccounts(), Message: Processing Request");
		return new ResponseEntity<List<Account>>(
				customerAccountManagementProcessor.getOperationsHandler().getAllAccounts(), HttpStatus.OK);
	}

	public ResponseEntity<List<Account>> getAllAccountsFallback() {
		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getAllAccountsFallback(), Message: Processing Request");
		return new ResponseEntity<List<Account>>(
				customerAccountManagementProcessor.getFallbackOperationsHandler().getAllAccountsFallback(),
				HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "LIST ALL CUSTOMERS WITH ACCOUNTS")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER-ACCOUNT/LIST", method = RequestMethod.GET, produces = { "application/json" })
	// Hystrix Configuration
	@HystrixCommand(fallbackMethod = "getCustomerAccountDetailsFallback")
	public ResponseEntity<List<CustomerAccountBean>> getAllCustomerAccounts() {

		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getAllCustomerAccounts(), Message: Processing Request");
		return new ResponseEntity<List<CustomerAccountBean>>(
				customerAccountManagementProcessor.getOperationsHandler().getCustomerAccountDetails(), HttpStatus.OK);
	}

	public ResponseEntity<List<CustomerAccountBean>> getCustomerAccountDetailsFallback() {

		logger.log(Level.INFO,
				"Service Name:customer-account-management-service , API Name: getCustomerAccountDetailsFallback(), Message: Processing Request");
		return new ResponseEntity<List<CustomerAccountBean>>(
				customerAccountManagementProcessor.getFallbackOperationsHandler().getCustomerAccountDetailsFallback(),
				HttpStatus.OK);
	}

}
