# CustomerPortalSampleApplication
Sample Customer Management Application demonstrating Springboot

# Account Management
The Account Management Service provides the REST APIs for Account Service . The Rest APIs can be accessed using Swagger UI:
http://locahost:12001/swagger-ui.html


# Customer Management
The Customer Management Service provides the REST APIs for Customer Service . The Rest APIs can be accessed using Swagger UI:
http://locahost:11001/swagger-ui.html


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


    Zuul aacount Swagger URL: http://localhost:10001/API/account-management-service/swagger-ui.html#/account-management
    Zuul customer Swagger URL: http://localhost:10001/API/customer-management-service/swagger-ui.html#




# Order of Execution
   1.Start Spring Cloud Config Service
   
   2.Start Eureka Discovery Service
   
   3.Start Zipkin Tracing Service
   
   4.Start rest of the services.


