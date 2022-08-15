package com.hcl.marketplace.service;

import java.util.List;

import com.hcl.marketplace.entity.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getAllUsers();


	public User updateuser(Long userId, User user);

}
