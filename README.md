# CustomerPortalSampleApplication

# Using Travis-Ci build:
[![Build Status](https://travis-ci.org/dipsscor/CustomerPortalSampleApplication.svg?branch=master)](https://travis-ci.org/dipsscor/CustomerPortalSampleApplication)

Sample Customer Management Application demonstrating microservices with Springboot, Netflix OSS , Docker and docker-compose.

# Prerequsites:
	JAVA Version = 9 or higher
	Compute : CPU 4
	Memory : 8GB or higher
	Docker Enviornment available



# Account Management
The Account Management Service provides the REST APIs for Account Service . The Rest APIs can be accessed using Swagger UI based on number of instances launched in docker-compose:

	http://locahost:12001/swagger-ui.html
	http://locahost:12002/swagger-ui.html


# Customer Management
The Customer Management Service provides the REST APIs for Customer Service . The Rest APIs can be accessed using Swagger UI based on number of instances launched in docker-compose:

	http://locahost:11001/swagger-ui.html
	http://locahost:11002/swagger-ui.html


# Customer Account Management
The Customer Account Management Service is a composite that provides the REST APIs for bot Account and Customer Service . The Rest APIs can be accessed using Swagger UI:

	http://locahost:13001/swagger-ui.html



# Eureka Discovery Service
The Eureka Discovery Service provides the Service Discovery capablities.

	http://locahost:9001


# Zipkin Tracing Service
The Zipkin Tracing Service provides the distributed tracing capablities.

	http://locahost:9411

       
# Spring Cloud Config Service
The Spring Cloud Config Service provides the externalization of configurations from github.

	http://locahost:8001


# Zuul Gateway Service
The Zuul Gateway Service works as the API Gateway for customer portal Management Application
	
	http://locahost:10001


  
    Zuul URL: http://localhost:10001/API/customer-management-service/CUSTOMER-MANAGEMENT/V1.0/CUSTOMER/LIST
    Zuul URL: http://localhost:10001/API/account-management-service/ACCOUNT-MANAGEMENT/V1.0/ACCOUNT/LIST


    Zuul account Swagger URL: http://localhost:10001/API/account-management-service/swagger-ui.html#/account-management
    Zuul customer Swagger URL: http://localhost:10001/API/customer-management-service/swagger-ui.html#

# Spring Admin Service
The Spring Admin Service is a community project to manage and monitor your Spring Boot applications.

	http://locahost:8002
The Spring Admin Service is integrated with SLACK to send notifications to Webhook:
https://hooks.slack.com/services/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





# Order of Execution
   1.Spring Cloud Config Service
   
   2.Eureka Discovery Service
   
   3.Zipkin Tracing Service
   
   4.Zuul Gateway Service.
   
   5.Spring Admin Service

   6.Rest of Services


# Docker Compose Intructions
  Run as : docker-compose up --scale account-management-service=2 --scale customer-management-service=2

	Here AccountManagementService and CustomerManagementService are started with 2 instances each so that Ribbon loadbalancing can be shown. Both the services have allowable 4 ports configured in Docker compose.
