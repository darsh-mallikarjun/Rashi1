package com.rashi.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotations.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rashi.webapp.dto.LoginUser;
import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.model.User;
import com.rashi.webapp.service.UserProductService;

@Controller
@RequestMapping
public class UserProductController {
	
	
	@Autowired
	private UserProductService userProductService;
	
	
	@GetMapping("/login")
	public String showloginpage() {
		return "rashilogin";
	}
	
	@PostMapping("/logout")
	public String Login(LoginUser loginuser , ProductPlotDto productPlot ,Model model) {
		User user = userProductService.findUserByEmail(loginuser.getEmail(),loginuser.getPassword() );
		if(user != null) {
			model.addAttribute("name", user.getName());
		}
		
		List<ProductPlots> product =userProductService.findByAddress( productPlot.getAddress());
		model.addAttribute("add", product);
		model.addAttribute("search",  new ProductPlotDto());
		List<ProductPlots> products = userProductService.findAll();
		model.addAttribute("product", products );
		return "rashilogout";
		
	}
	
}
			
			
			

