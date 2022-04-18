package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void initFunc() {
		logger.info("Some changes to the project");
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
