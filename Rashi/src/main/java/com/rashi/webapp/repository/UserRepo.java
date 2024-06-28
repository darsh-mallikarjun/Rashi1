package com.rashi.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rashi.webapp.model.User;


@Repository
public interface UserRepo extends JpaRepository<User ,Integer> {
	
	User findByEmail(String email);
	
}
