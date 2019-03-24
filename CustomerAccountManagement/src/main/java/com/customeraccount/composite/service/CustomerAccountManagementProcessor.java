package com.customeraccount.composite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerAccountManagementProcessor {

	@Autowired
	private OperationsHandler operationsHandler;
	
	@Autowired
	private FallbackOperationsHandler fallbackOperationsHandler;

	
	public OperationsHandler getOperationsHandler() {
		return operationsHandler;
	}

	public void setOperationsHandler(OperationsHandler operationsHandler) {
		this.operationsHandler = operationsHandler;
	}

	public FallbackOperationsHandler getFallbackOperationsHandler() {
		return fallbackOperationsHandler;
	}

	public void setFallbackOperationsHandler(
			FallbackOperationsHandler fallbackOperationsHandler) {
		this.fallbackOperationsHandler = fallbackOperationsHandler;
	}


}
