FROM openjdk:10
ADD build/libs/spring-cloud-0.0.1-SNAPSHOT.jar computation-service.jar
EXPOSE 8071
ENTRYPOINT ["java", "-jar", "computation-service.jar"]
