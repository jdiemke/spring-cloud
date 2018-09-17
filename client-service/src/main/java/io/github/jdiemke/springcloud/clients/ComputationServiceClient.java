package io.github.jdiemke.springcloud.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("computation-service")
public interface ComputationServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Name getName();

}
