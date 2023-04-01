package com.CoreJava.Mutithreading.Problem;

public class Stall implements Runnable {
	private String stallName;
	private String details;
	private double stallArea;
	private double stallCost;
	private String owner;
	
    public Stall() {
		
	}

	public Stall(String stallName, String details, double stallArea, String owner) {
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}

	public String getStallName() {
		return stallName;
	}

	public String getDetails() {
		return details;
	}

	public double getStallArea() {
		return stallArea;
	}

	public double getStallCost() {
		return stallCost;
	}

	public String getOwner() {
		return owner;
	}

	public void run() {
		
		stallCost=stallArea*150;
	}
	
	
	
	
	
	
}
