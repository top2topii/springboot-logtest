package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	private static Logger logger = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		logger.debug("Debug log message");
		SpringApplication.run(TestApplication.class, args);
	}

}
