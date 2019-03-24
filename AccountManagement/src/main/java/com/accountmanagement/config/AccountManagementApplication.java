package com.accountmanagement.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.accountmanagement.*"})
@EnableDiscoveryClient
@EnableFeignClients
public class AccountManagementApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountManagementApplication.class, args);
	}
	
}
