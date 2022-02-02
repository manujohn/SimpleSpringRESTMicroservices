package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class UserDepartment {
	private User user;
	private Department department;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
