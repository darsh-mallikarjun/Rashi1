package com.rashi.webapp.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.dto.UserRegistrationDTO;
import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.model.Role;
import com.rashi.webapp.model.User;
import com.rashi.webapp.repository.ProductPlotRepo;
import com.rashi.webapp.repository.UserRepo;



@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepo userrepository;
	
	
	
	public UserServiceImpl( UserRepo userrepository) {
		super();
		this.userrepository = userrepository;
	}
	
	@Override
	public User save(UserRegistrationDTO registration) {
		User user =new User(registration.getName(),registration.getEmail(),registration.getPassword(),registration.getMobile(),Arrays.asList(new Role("ROLE_USER")));
		return userrepository.save(user) ;
	}


	@Override
	public User findUserByEmail(String email , String password) {
		User user = userrepository.findByEmail(email);
		if(user !=null && user.getPassword().equals(password)) {
			return user;
	}
	return null;
		 
	}


	
}

	


