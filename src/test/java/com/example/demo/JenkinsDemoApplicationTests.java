package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	public contextLoads() {
		logger.info("Test case running...");
		logger.info("Test case continue to run...");
		Assertions.assertEquals(true, true);
	}

}
