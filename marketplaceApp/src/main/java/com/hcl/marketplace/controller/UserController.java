package com.hcl.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.marketplace.entity.User;
import com.hcl.marketplace.repository.UserRepository;
import com.hcl.marketplace.service.impl.UserServiceImpl;



@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired UserRepository userRepo;
	
	@RequestMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		System.out.println("Getting user list.");
		model.addAttribute("listUsers", listUsers);
		return "users";
	}

}
