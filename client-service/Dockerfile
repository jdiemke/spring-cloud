FROM openjdk:10
ADD build/libs/spring-cloud-0.0.1-SNAPSHOT.jar client-service.jar
EXPOSE 8072
ENTRYPOINT ["java", "-jar", "client-service.jar"]
