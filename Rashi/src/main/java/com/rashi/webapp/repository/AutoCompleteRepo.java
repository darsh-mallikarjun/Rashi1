package com.rashi.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rashi.webapp.model.ProductPlots;

@Repository
public interface AutoCompleteRepo extends JpaRepository<ProductPlots ,Integer> {

	List<ProductPlots> findAll();
	
}
