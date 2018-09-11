FROM openjdk:10
ADD build/libs/spring-cloud-0.0.1-SNAPSHOT.jar eureka-service.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "eureka-service.jar"]
