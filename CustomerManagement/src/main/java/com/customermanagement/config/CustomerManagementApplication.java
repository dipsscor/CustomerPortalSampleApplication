package com.customermanagement.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.customermanagement.*"})
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementApplication.class, args);
	}
	
}
