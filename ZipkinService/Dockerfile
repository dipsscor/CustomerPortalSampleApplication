FROM openjdk
MAINTAINER Dipankar Chatterjee <dipankar.c@hcl.com>
ADD /target/ZipkinService.jar ZipkinService.jar
ENTRYPOINT ["java", "-jar", "/ZipkinService.jar"]
EXPOSE 9411
