package com.CoreJava.AccessModifiers;

public class Bike {
	
	public int BikeId;
	protected String brand;
	String color;
	private float cc;
	

	public Bike() {
		
	}


	public Bike(int bikeId, String brand, String color, float cc) {
		BikeId = bikeId; //All access modifier access within class
		this.setBrand(brand);
		this.color = color;
		this.cc = cc;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
