FROM openjdk
MAINTAINER Dipankar Chatterjee <dipankar.c@hcl.com>
ADD /target/ZipkinService.jar ZipkinService.jar
ENTRYPOINT exec java -jar /ZipkinService.jar ZipkinService
EXPOSE 9411
