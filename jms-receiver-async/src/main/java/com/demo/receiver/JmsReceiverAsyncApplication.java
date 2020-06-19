package com.demo.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsReceiverAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsReceiverAsyncApplication.class, args);
	}

}
