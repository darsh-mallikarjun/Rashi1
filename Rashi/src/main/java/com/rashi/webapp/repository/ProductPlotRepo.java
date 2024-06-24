package com.rashi.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rashi.webapp.model.ProductPlots;



public interface ProductPlotRepo extends JpaRepository<ProductPlots ,Integer> {
	
 List<ProductPlots> findByAddress(String address);
 
	
}
