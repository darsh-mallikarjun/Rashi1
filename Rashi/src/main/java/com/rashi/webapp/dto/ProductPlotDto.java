package com.rashi.webapp.dto;

public class ProductPlotDto {

	private  int id;
	private double price;
	 private String address;
	 private String plot_area;
	 private String dimensions;
	 private String image;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	 

}
