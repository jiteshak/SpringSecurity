package com.youtube.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.entity.User;
import com.youtube.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/registerNewUser")
	public User registerNewUser(@RequestBody User user) {
		
		return userService.registerNewUser(user);
	}
	
	@PostConstruct
	public void initRolesAndUsers() {
		userService.initRoleAndUser();
	}
	
	@GetMapping("/forAdmin")
//	@PreAuthorize("hasRole('Admin')")
	public String forAdmin() {
		return "This URL is only accessible  to admin";
	}
	
	@GetMapping("/forUser")
//	@PreAuthorize("hasRole('User')")
	public String forUser() {
		return "This URL is only accessible  to user";
	}
}
