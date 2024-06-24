package com.rashi.webapp.service;

import java.util.List;

import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.model.ProductPlots;

public interface ProductService {
	
	public List<ProductPlots> findByAddress(String address );
	
	public List<ProductPlots>findAll();
	
	ProductPlots save(ProductPlotDto  productPlotDto);
	


}
