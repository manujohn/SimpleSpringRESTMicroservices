package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public User saveUser(User user) {
		logger.info("Inside UserService class saveUser method");
		return userrepo.save(user); 
	}

}
