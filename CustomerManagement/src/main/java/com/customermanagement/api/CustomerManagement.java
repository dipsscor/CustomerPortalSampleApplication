package com.customermanagement.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customermanagement.beans.CustomerRequestBean;
import com.customermanagement.beans.CustomerResponseBean;
import com.customermanagement.config.ApplicationConfigurationLoader;
import com.customermanagement.model.Customer;
import com.customermanagement.service.CustomerManagementProcessor;
import com.customermanagement.util.ResponseBeanConverter;
import com.customermanagement.validator.CustomerRequestBeanValidator;

@RestController
@RequestMapping("/CUSTOMER-MANAGEMENT/V1.0")
// Swagger Specific Annotations
@Api(value = "CUSTOMER MANAGEMENT", description = "CUSTOMER MANAGEMENT")
public class CustomerManagement {

	private static final Logger logger = Logger.getLogger(CustomerManagement.class.getName());

	@Autowired
	ApplicationConfigurationLoader CONFIG;

	@Autowired
	CustomerManagementProcessor customerManagementProcessor;

	@Autowired
	ResponseBeanConverter responseBeanConverter;

	// VALIDATOR CONFIGURATIONS
	@Autowired
	CustomerRequestBeanValidator customerRequestBeanValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(customerRequestBeanValidator);
	}

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
	@RequestMapping(value = "/CUSTOMER/LIST", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<List<Customer>> getAllCustomers() {
		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: getAllCustomers(), Message: Processing Request");
		return new ResponseEntity<List<Customer>>(
				customerManagementProcessor.getQueryOperationsHandler().getAllCustomers(), HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "FIND SPECIFIC CUSTOMER")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER/FIND", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<Customer> getCustomerByDisplayId(
			@RequestParam(name = "customerDisplayId", required = true) String _customerDisplayId) {

		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: getCustomerByDisplayId(), Message: Processing Request");
		return new ResponseEntity<Customer>(
				customerManagementProcessor.getQueryOperationsHandler().getCustomerByDisplayId(_customerDisplayId),
				HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "SEARCH CUSTOMERS")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER/SEARCH", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<List<Customer>> getCustomerByDisplayId(
			@RequestParam(name = "customerDisplayId", required = false) String _customerDisplayId,
			@RequestParam(name = "customerName", required = false) String _customerName) {

		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: getCustomerByDisplayId(), Message: Processing Request");
		return new ResponseEntity<List<Customer>>(customerManagementProcessor.getQueryOperationsHandler()
				.searchCustomers(_customerDisplayId, _customerName), HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "CREATE CUSTOMER")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 201, message = "SUCCESSFUL CREATION OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER/CREATE", method = RequestMethod.POST, produces = { "application/json",
			"application/x-javascript", "application/javascript" }, consumes = { "application/json",
					"application/x-javascript", "application/javascript" })
	public ResponseEntity<CustomerResponseBean> createCustomer(@Valid @RequestBody CustomerRequestBean _request) {

		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: createCustomer(), Message: Processing Request");
		return new ResponseEntity<CustomerResponseBean>(
				customerManagementProcessor.getCrudOperationsHandler().createCustomer(_request), HttpStatus.CREATED);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "UPDATE CUSTOMER")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER/UPDATE", method = RequestMethod.PUT, produces = { "application/json",
			"application/x-javascript", "application/javascript" }, consumes = { "application/json",
					"application/x-javascript", "application/javascript" })
	public ResponseEntity<CustomerResponseBean> updateCustomer(@RequestBody CustomerRequestBean _request,
			@RequestParam(name = "customerDisplayId", required = true) String _customerDisplayId) {

		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: updateCustomer(), Message: Processing Request");
		return new ResponseEntity<CustomerResponseBean>(
				customerManagementProcessor.getCrudOperationsHandler().updateCustomer(_request, _customerDisplayId),
				HttpStatus.OK);
	}

	/**
	 * @param _request
	 * @return
	 */
	@ApiOperation(value = "REMOVE CUSTOMER")
	// Swagger Specific Annotation
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESSFUL OPERATION"),
			@ApiResponse(code = 401, message = "UNAUTHORIZED TO VIEW RESOURCE"),
			@ApiResponse(code = 403, message = "ACCESS FORBIDDEN"),
			@ApiResponse(code = 404, message = "RESOURCE NOT FOUND") })
	@RequestMapping(value = "/CUSTOMER/REMOVE", method = RequestMethod.DELETE, produces = { "application/json",
			"application/x-javascript", "application/javascript" })
	public ResponseEntity<CustomerResponseBean> removeCustomer(
			@RequestParam(name = "customerDisplayId", required = true) String _customerDisplayId) {

		logger.log(Level.INFO,
				"Service Name:customer-management-service , API Name: removeCustomer(), Message: Processing Request");
		return new ResponseEntity<CustomerResponseBean>(
				customerManagementProcessor.getCrudOperationsHandler().removeCustomer(_customerDisplayId),
				HttpStatus.OK);
	}

}
