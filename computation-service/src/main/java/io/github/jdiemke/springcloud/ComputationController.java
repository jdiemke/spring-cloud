package io.github.jdiemke.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputationController {

    @RequestMapping("/")
    public String getName() {
        return "Johannes";
    }

}
