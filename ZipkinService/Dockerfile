FROM openjdk
MAINTAINER Abhishek Pandey <pandeyab.c@hcl.com>
ADD ./target/ZipkinService.jar /app
CMD ["java", "-Xmx200m", "-jar", "/app/ZipkinService.jar"]
EXPOSE 9411
