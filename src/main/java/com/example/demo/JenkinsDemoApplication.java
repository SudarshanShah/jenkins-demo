package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public void initFunc() {
		logger.info("Some changes to the project");
		logger.info("Application started");
		logger.info("This one to be deployed on Tomcat");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JenkinsDemoApplication.class);
	}
}
