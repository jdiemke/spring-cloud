package io.github.jdiemke.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputationController {

    private static final Logger logger = LoggerFactory.getLogger(ComputationController.class);

    @RequestMapping("/")
    public String getName() {
        logger.info("Computing Name ...");
        return "Johannes";
    }

}
