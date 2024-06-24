package com.rashi.webapp.controller.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.service.ProductService;

@Controller
@RequestMapping("/address")
public class SearchProductController {

	private ProductService productservice;

	public SearchProductController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}
	
	
	@GetMapping("/welcome")
	public String searchProduct() {
		return "redirect:/address" ;
	}
	
	@GetMapping
	public String getUserByEmail(ProductPlotDto productPlotDto, Model model) {
		List<ProductPlots> product =productservice.findByAddress(productPlotDto.getAddress());
		List<ProductPlots> products = productservice.findAll();
		model.addAttribute("product", products );	
		model.addAttribute("search",  new ProductPlotDto());
		model.addAttribute("add", product);
			return "rashiwelcome";
		}
	}
	
