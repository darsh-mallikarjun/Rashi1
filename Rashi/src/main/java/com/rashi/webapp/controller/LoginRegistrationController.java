package com.rashi.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rashi.webapp.dto.LoginUser;
import com.rashi.webapp.model.User;
import com.rashi.webapp.service.UserService;


@RequestMapping("/login")
@Controller
public class LoginRegistrationController {

	private UserService userservice;

	public LoginRegistrationController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@GetMapping
	public String showLoginform(Model model) {
		model.addAttribute("login", new LoginUser());
		return "rashiLogin" ;
	}
	
	
	@PostMapping
	public String getUserBtEmail(LoginUser loginuser, Model model) {
		User user =userservice.findUserByEmail(loginuser.getEmail(), loginuser.getPassword());
		if(user != null) {
			return "redirect:/address";
		}else {
			model.addAttribute("error" ,"user not found");
			model.addAttribute("login", loginuser);
			return "rashiLogin";
		}
	}
	
}
