package com.hcl.marketplace;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Marketplace {

	public static void main(String[] args) {
		SpringApplication.run(Marketplace.class, args);
		System.out.println("Hello World!");
	}

}
