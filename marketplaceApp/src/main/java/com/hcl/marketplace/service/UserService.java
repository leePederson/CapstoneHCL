package com.hcl.marketplace.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.marketplace.entity.User;

@Service
public interface UserService {

	public boolean saveUser(User user);

	public List<User> getAllUsers();


	public User updateuser(Long userId, User user);

}
