package com.rashi.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="user_products")
public class UserProductplots {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private  User user;
	

	@ManyToOne
	@JoinColumn(name ="plots_id")
	private  ProductPlots productPlots;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ProductPlots getProductPlots() {
		return productPlots;
	}


	public void setProductPlots(ProductPlots productPlots) {
		this.productPlots = productPlots;
	}
	
	
}
