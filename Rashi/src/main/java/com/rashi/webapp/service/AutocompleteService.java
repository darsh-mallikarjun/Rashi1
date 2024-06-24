package com.rashi.webapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.repository.AutoCompleteRepo;

@Service
public class AutocompleteService {
	

	private AutoCompleteRepo autoCompleterep;

	public AutocompleteService(AutoCompleteRepo autoCompleterep) {
		super();
		this.autoCompleterep = autoCompleterep;
	}
	
public List<String> getAllAddress() {
	
	List<ProductPlots> product = autoCompleterep.findAll();
	return product.stream()
			.map(ProductPlots -> ProductPlots.getAddress())
			.collect(Collectors.toList());
		
		
	}
}
