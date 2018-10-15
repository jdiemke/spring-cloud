# spring-cloud
Uses the following Spring Cloud / Netflix stack features:
* Netflix Eureka
* Netflix Zuul
* Spring Cloud OpenFeign

## Run using docker-compose
```
docker-compose build
docker-compose up
```

## Service Overview
| Service             | Action                      |
| ------------------- | --------------------------- |
| client-service      | localhost:8072              |
| computation-service | localhost:8071              |
| eureka-service      | localhost:8070              |
| gateway-service     | localhost:8073/service-name |

## Build Docker Images
### Eureka Service
```
cd eureka-service
./gradlew bootJar
docker build -t eureka-service .
```

## Run Docker Images
```
docker run -p 8070:8070 eureka-service
```

## TODO
* Monitoring
  * Prometheus
  * Micrometer.IO (https://youtu.be/JAdxO1XboJY)
  * Grafana
* Tracing
  * Zipkin

## References

### Exception Handling
* https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc
* https://www.baeldung.com/exception-handling-for-rest-with-spring
* https://www.baeldung.com/spring-mvc-controller-custom-http-status-code
* https://www.baeldung.com/spring-response-status-exception
