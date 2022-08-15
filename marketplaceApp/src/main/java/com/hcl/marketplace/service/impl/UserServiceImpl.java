package com.hcl.marketplace.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.marketplace.entity.User;
import com.hcl.marketplace.repository.UserRepository;
import com.hcl.marketplace.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepo = null;
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}


	@Override
	public User updateuser(Long userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
