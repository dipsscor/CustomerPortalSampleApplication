FROM openjdk
MAINTAINER Dipankar Chatterjee <dipankar.c@hcl.com>
ADD target/GatewayService-1.0.jar GatewayService-1.0.jar
ENTRYPOINT exec java -jar /GatewayService-1.0.jar Zuul-Gateway-Service
EXPOSE 10001