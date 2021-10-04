package com.emp.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.cruddemo.entity.User;
import com.emp.cruddemo.repos.UserCrudRepo;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserCrudRepo userCrudRepo;
	@Override
	public User addUser(User user) {
		
		User userSaved=userCrudRepo.save(user);
		return userSaved;
	}

	@Override
	public List<User> getAllUser() {
		
		return userCrudRepo.findAll();
	}

	@Override
	public User getUserById(Long useridL) {
		
		return userCrudRepo.findById(useridL).get();
	}

	@Override
	public void deleteUserById(Long useridL) {
		
		userCrudRepo.deleteById(useridL);
	}

}
