package com.discoveryservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CustomerPortalDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPortalDiscoveryServiceApplication.class, args);
	}
}
