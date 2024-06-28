package com.rashi.webapp.controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.service.ProductService;


@Controller
@RequestMapping("/addproduct")
public class AddProductPlotsController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping
	public String AddProduct(Model model) {
		model.addAttribute("product", new ProductPlotDto());
		return "ProductDetails";
	}
	
	@PostMapping
	public String showproduct(@ModelAttribute("product") ProductPlotDto productPlotDto) {
		productservice.save(productPlotDto);
		return "redirect:/addproduct";
	}

}

