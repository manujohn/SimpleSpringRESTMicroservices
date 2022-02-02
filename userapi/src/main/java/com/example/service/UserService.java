package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Department;
import com.example.model.User;
import com.example.model.UserDepartment;
import com.example.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userrepo;

	@Autowired
	RestTemplate resttemplate;

	@Autowired
	UserDepartment userDepartment;

	Logger logger = LoggerFactory.getLogger(UserService.class);

	public User saveUser(User user) {
		logger.info("Inside UserService class saveUser method");
		return userrepo.save(user);
	}

	public UserDepartment findUser(Long id) {
		logger.info("Inside UserService class findUser method");
		User user = userrepo.findByUserId(id);
		Department department = resttemplate
				.getForObject("http://localhost:9002/department/" + user.getUserDepartment(), Department.class);

		userDepartment.setUser(user);
		userDepartment.setDepartment(department);
		return userDepartment;
	}

}
