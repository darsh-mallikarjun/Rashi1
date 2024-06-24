package com.rashi.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "product_plots")
public class ProductPlots {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
 private int id;
 private double price;
 private String address;
 private String plot_area;
 private String dimensions;
 private String image;
 
 
 public ProductPlots() {
	 
	 
 }


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getPlot_area() {
	return plot_area;
}


public void setPlot_area(String plot_area) {
	this.plot_area = plot_area;
}


public String getDimensions() {
	return dimensions;
}


public void setDimensions(String dimensions) {
	this.dimensions = dimensions;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}



public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public ProductPlots(double price, String address, String plot_area, String dimensions , String image) {
	super();
	this.price = price;
	this.address = address;
	this.plot_area = plot_area;
	this.dimensions = dimensions;
	this.image = image;
}


@Override
public String toString() {
	return "ProductPlots [id=" + id + ", price=" + price + ", address=" + address + ", plot_area=" + plot_area
			+ ", dimensions=" + dimensions + "]";
}

 
 
}
