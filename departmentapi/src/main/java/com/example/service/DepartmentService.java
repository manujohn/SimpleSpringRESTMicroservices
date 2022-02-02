package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Department;
import com.example.repository.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	Logger logger = LoggerFactory.getLogger(DepartmentService.class);

	public Department saveDepartment(Department department) {
		logger.info("Inside DepartmentService class saveDepartment method");
		return departmentRepo.save(department);
	}

	public Department findDepartment(Long id) {
		logger.info("Inside DepartmentService Class findDepartment method");
		return departmentRepo.findByDepartmentId(id);
	}

}
