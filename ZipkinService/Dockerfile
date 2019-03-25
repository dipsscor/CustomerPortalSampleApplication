FROM openjdk
MAINTAINER Dipankar Chatterjee <dipankar.c@hcl.com>
ADD ./target/ZipkinService.jar /app
CMD ["java", "-Xmx200m", "-jar", "/app/ZipkinService.jar"]
EXPOSE 9411
