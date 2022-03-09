package com.axess.smartbankapi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SmartBankApiApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SmartBankApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SmartBankApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("catalogue service started");
	}
	


}
