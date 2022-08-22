package com.hcl.marketplace.service.impl;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.marketplace.entity.User;
import com.hcl.marketplace.repository.UserRepository;
import com.hcl.marketplace.service.EmailService;
import com.hcl.marketplace.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private EmailService mailSenderService;
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public synchronized boolean saveUser(User user) {
		if (getUserByEmail(user.getEmail()) != null) {
			return false;
		} else {
			mailSenderService.sendSimpleMessage(user.getEmail());
//			try {
//				mailSenderService.sendEmailWithAttachment(user.getEmail());
//			} catch (MessagingException e) {
//			{catch(IOException e) {
//			}
		}
		userRepo.save(user);
		return true;
	}
	private User getUserByEmail(String email) {
		User user = userRepo.findByEmail(email);
		return user;
	}


	@Override
	public List<User> getAllUsers() {
		System.out.println("Creating List of users from Database.");
		return userRepo.findAll();
	}


	@Override
	public User updateuser(Long userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
