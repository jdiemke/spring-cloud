# spring-cloud

| Service             | Action         |
| ------------------- | -------------- |
| client-service      | localhost:8072 |
| computation-service | localhost:8071 |
| eureka-service      | localhost:8070 |
| gateway-service     |                |
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
