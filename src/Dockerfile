FROM openjdk:8-jdk-alpine
MAINTAINER hizhangbo
RUN ["mkdir", "app"]
ADD spring-cloud-kubernetes-sample.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/spring-cloud-kubernetes-sample.jar"]