package com.hcl.marketplace;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.hcl.marketplace.service.EmailService;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Marketplace {

	public static void main(String[] args) {
		SpringApplication.run(Marketplace.class, args);
		System.out.println("Marketplace App Started.");

		
	}
}

