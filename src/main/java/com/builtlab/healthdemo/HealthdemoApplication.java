package com.builtlab.healthdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthdemoApplication.class, args);
	}

	/**
	 *
	 * controller call -> service -> repository -> database
	 **/


}
