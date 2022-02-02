package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Long userId;
	private String userName;
	private Long userDepartment;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(Long userDepartment) {
		this.userDepartment = userDepartment;
	}

}
