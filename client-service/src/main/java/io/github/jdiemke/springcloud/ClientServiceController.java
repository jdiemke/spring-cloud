package io.github.jdiemke.springcloud;

import io.github.jdiemke.springcloud.clients.ComputationServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientServiceController {

    @Autowired
    ComputationServiceClient computationServiceClient;

    @RequestMapping("/")
    public String get() {
        return "Hello " + computationServiceClient.getName().value + "!";
    }

}
