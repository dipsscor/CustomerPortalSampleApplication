package com.customeraccount.composite.beans;

import java.util.List;
import java.util.Set;


public class Customer {

    private Long id;

	private String customerDisplayId;

	private String customerName;

	private String emailAddress;
    
	private CustomerCategory customerCategory;
	
	private CustomerType customerType;
	
	private Set<CustomerAddress> customerAddresses;
	
	private List<AdditionalAttributes> additionalAttributes;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerDisplayId() {
		return customerDisplayId;
	}

	public void setCustomerDisplayId(String customerDisplayId) {
		this.customerDisplayId = customerDisplayId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public CustomerCategory getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(CustomerCategory customerCategory) {
		this.customerCategory = customerCategory;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public Set<CustomerAddress> getCustomerAddresses() {
		return customerAddresses;
	}

	public void setCustomerAddresses(Set<CustomerAddress> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}

	public List<AdditionalAttributes> getAdditionalAttributes() {
		return additionalAttributes;
	}

	public void setAdditionalAttributes(
			List<AdditionalAttributes> additionalAttributes) {
		this.additionalAttributes = additionalAttributes;
	}
}
