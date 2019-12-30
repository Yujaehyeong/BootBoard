package com.example.practice.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BoardRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(BoardRunner.class);


    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("=============");
        logger.info("This is Spring Boot App");
        logger.info("=============");

    }

}
