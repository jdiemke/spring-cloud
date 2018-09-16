FROM openjdk:10
ADD build/libs/spring-cloud-0.0.1-SNAPSHOT.jar gateway-service.jar
EXPOSE 8073
ENTRYPOINT ["java", "-jar", "gateway-service.jar"]
