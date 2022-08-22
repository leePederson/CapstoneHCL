package com.hcl.marketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendSimpleMessage(String emailAddress) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(emailAddress);
		message.setSubject("Test");
		message.setText("This is a test.");
		javaMailSender.send(message);
	}
}

