package com.newswhip.UrlDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting UrlDb Application");
        SpringApplication.run(Application.class, args);
        logger.info("Closing UrlDb Application");
    }
}
