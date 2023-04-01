package com.CoreJava.Collection;

public class Flight implements Comparable<Flight> {
	
	private String name;
	private String departure;
	private int price;
	
	public Flight(String name, String departure, int price) {
		this.name = name;
		this.departure = departure;
		this.price = price;
	}

	public Flight() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", departure=" + departure + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Flight f2) {
		String s1 = this.departure;
		String s2 = f2.departure;
		return s1.compareTo(s2);
	}

	
	}


	
	
	
	

