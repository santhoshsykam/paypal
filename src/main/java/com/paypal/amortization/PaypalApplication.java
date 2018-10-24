package com.paypal.amortization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaypalApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Application");
		SpringApplication.run(PaypalApplication.class, args);
	}
}
