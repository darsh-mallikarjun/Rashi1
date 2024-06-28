package com.rashi.webapp.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.model.User;

import com.rashi.webapp.repository.ProductPlotRepo;
import com.rashi.webapp.repository.UserRepo;



@Service
public class UserProductService {
	
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ProductPlotRepo productPlotRepo;
	

	public User findUserByEmail(String email , String password ) {
		User user = userRepo.findByEmail(email);
		if(user !=null && user.getPassword().equals(password)) {
			return user;
	}
	return null;
		 
	}
	
	public List<ProductPlots> findByAddress(String address)
	 {
		return productPlotRepo.findByAddress(address);
		 
	}

	public List<ProductPlots> findAll() {
		
		return productPlotRepo.findAll();
	}
	}
	
