package com.customeraccount.composite.beans;


public class Account {
	

    private Long id;

	private String accountDisplayId;

	private String accountName;

	private String customerDisplayId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountDisplayId() {
		return accountDisplayId;
	}

	public void setAccountDisplayId(String accountDisplayId) {
		this.accountDisplayId = accountDisplayId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCustomerDisplayId() {
		return customerDisplayId;
	}

	public void setCustomerDisplayId(String customerDisplayId) {
		this.customerDisplayId = customerDisplayId;
	}

}
