package com.jbevents.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JbeventsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbeventsBackendApplication.class, args);
		System.out.println("Welcome to online Booking Events");
	}

}
