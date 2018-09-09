package io.github.jdiemke.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
@EnableEurekaClient
@SpringBootApplication
public class ClientServiceApplication {

	@Autowired
	public RestTemplate rest;

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String get() {
		return "Hello " + rest.getForObject("http://computation-service/", String.class) + "!";
	}

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}


