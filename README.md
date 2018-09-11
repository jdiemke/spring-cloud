# spring-cloud

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
