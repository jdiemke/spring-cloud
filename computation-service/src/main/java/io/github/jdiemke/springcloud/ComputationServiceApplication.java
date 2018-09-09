package io.github.jdiemke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ComputationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputationServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String get() {
		return "Johannes";
	}

}
