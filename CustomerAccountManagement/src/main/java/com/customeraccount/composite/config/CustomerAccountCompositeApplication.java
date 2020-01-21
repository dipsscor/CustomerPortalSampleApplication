package com.customeraccount.composite.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.customeraccount.composite.*"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages={"com.customeraccount.composite.*"})
@EnableHystrix
@EnableHystrixDashboard
public class CustomerAccountCompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAccountCompositeApplication.class, args);
	}
	
}
