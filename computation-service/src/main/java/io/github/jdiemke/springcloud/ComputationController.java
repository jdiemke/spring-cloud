package io.github.jdiemke.springcloud;

import io.github.jdiemke.springcloud.model.Name;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputationController {

    private static final Logger logger = LoggerFactory.getLogger(ComputationController.class);

    @RequestMapping("/")
    public Name getName() {
        logger.info("Computing Name ...");

        if (Math.random() > 0.5) {
            logger.error("Name computation failed!");
            throw new ComputationFailedException();
        }

        return new Name("Johannes");
    }

}
