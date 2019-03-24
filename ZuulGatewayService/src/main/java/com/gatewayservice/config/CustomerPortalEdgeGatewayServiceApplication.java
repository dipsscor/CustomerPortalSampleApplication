package com.gatewayservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication(scanBasePackages={"com.gatewayservice.*"})
public class CustomerPortalEdgeGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPortalEdgeGatewayServiceApplication.class, args);
	}
}
