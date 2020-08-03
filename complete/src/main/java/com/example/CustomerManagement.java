package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akverma
 * Main spring boot class to launch application
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class CustomerManagement {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagement.class, args);
	}
	
}
