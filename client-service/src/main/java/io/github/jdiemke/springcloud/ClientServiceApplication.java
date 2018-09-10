package io.github.jdiemke.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ClientServiceApplication {

	@Autowired
	ComputationServiceClient computationServiceClient;

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String get() {
		return "Hello " + computationServiceClient.getName() + "!";
	}

}

@FeignClient("computation-service")
interface ComputationServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
	String getName();
	
}
