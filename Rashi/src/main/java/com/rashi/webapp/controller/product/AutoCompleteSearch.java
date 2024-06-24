package com.rashi.webapp.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rashi.webapp.service.AutocompleteService;

@RestController
@RequestMapping("/search")
public class AutoCompleteSearch {
	
	@Autowired
	private AutocompleteService autocompleteservice;

	public AutoCompleteSearch(AutocompleteService autocompleteservice) {
		super();
		this.autocompleteservice = autocompleteservice;
	}


	@GetMapping("/autocomplete")
	public List<String> getAllAddress(){
		return autocompleteservice.getAllAddress();
	
	}

}
