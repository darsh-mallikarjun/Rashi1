package com.rashi.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rashi.webapp.dto.UserRegistrationDTO;
import com.rashi.webapp.service.UserService;


@Controller
@RequestMapping("/registartion")
public class UserRegistrationController {
	
	private UserService userservice;

	public UserRegistrationController(UserService userservice) {
		super();
		this.userservice = userservice;
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "rashiwelcome" ;
	}	
	
	
	@ModelAttribute("user")
	public UserRegistrationDTO userregistrationdto() {
		return new UserRegistrationDTO();
	}
	
	@GetMapping
	public String showregisterform() {
		return "rashisignup" ;
	}	
	
	@PostMapping
	public String registerUser(@ModelAttribute("user") UserRegistrationDTO registration) {
	userservice.save(registration);
	return "redirect:/address";

	
}
	
}