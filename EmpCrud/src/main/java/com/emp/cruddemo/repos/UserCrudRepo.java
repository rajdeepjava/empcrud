package com.emp.cruddemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.cruddemo.entity.User;

public interface UserCrudRepo extends JpaRepository<User,Long>{

}
