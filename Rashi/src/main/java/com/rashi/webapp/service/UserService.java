package com.rashi.webapp.service;


import com.rashi.webapp.dto.UserRegistrationDTO;
import com.rashi.webapp.model.User;

public interface UserService {

	User save(UserRegistrationDTO registration);
	
	public User findUserByEmail(String email ,String password);
	
}
