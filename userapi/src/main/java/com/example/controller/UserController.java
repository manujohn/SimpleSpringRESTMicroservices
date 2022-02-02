package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.model.UserDepartment;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userservice;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		logger.info("Inside UserController class saveUser method");
		return userservice.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public UserDepartment findUser(@PathVariable("id") Long id) {
		logger.info("Inside UserController class findUser method");
		return userservice.findUser(id);
	}

}
