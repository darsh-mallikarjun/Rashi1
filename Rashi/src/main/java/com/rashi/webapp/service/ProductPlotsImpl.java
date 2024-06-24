package com.rashi.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashi.webapp.dto.ProductPlotDto;
import com.rashi.webapp.model.ProductPlots;
import com.rashi.webapp.repository.ProductPlotRepo;



@Service
public class ProductPlotsImpl implements ProductService  {

	@Autowired
	private ProductPlotRepo productPlotReop;

	@Override
	public List<ProductPlots> findByAddress(String address ) {
		return productPlotReop.findByAddress(address);
		 
	}

	@Override
	public ProductPlots save(ProductPlotDto productPlotDto) {
		ProductPlots product =  new ProductPlots(productPlotDto.getPrice(),productPlotDto.getAddress(),productPlotDto.getPlot_area(),productPlotDto.getDimensions(),productPlotDto.getImage());
		return productPlotReop.save(product);
	}

	@Override
	public List<ProductPlots> findAll() {
		
		return productPlotReop.findAll();
	}

	}

