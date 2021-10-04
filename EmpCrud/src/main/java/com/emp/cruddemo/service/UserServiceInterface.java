package com.emp.cruddemo.service;

import java.util.List;

import com.emp.cruddemo.entity.User;

public interface UserServiceInterface {

	

	public User addUser(User user);
	public List<User> getAllUser();
	public User getUserById(Long useridL);
	public void deleteUserById(Long useridL);
}
