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

import com.example.model.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmnentController {
	
	@Autowired
	DepartmentService departmentService;
	
	Logger logger = LoggerFactory.getLogger(DepartmnentController.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Inside DepartmentController class saveDepartment method");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartment(@PathVariable("id") Long id) {
		logger.info("Inside DepartmentController class findDepartment method");
		return departmentService.findDepartment(id);
	}
}
