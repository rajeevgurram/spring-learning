package com.spring.learning.SpringLearning;

import com.spring.learning.properties.ExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
@ComponentScan({
        "com.spring.learning.properties"
})
//Loading url.properties
@PropertySource("classpath:url.properties")
public class SpringLearningPropertiesApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringLearningPropertiesApplication.class, args);

        ExternalService es = ctx.getBean(ExternalService.class);
        LOGGER.info("---------------->, {}", es.getServiceUrl());
    }
}
