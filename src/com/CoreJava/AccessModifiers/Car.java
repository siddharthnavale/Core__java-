package com.CoreJava.AccessModifiers;

public class Car {
	
	public static void main(String[] args) {
		Bike b1= new Bike();
		int BikeId=b1.BikeId;// public accessible everywhere
		
	//float cc=b1.cc; //access modifier of cc is private hence it not visible
//outside a class. we use private to hide implementation of class.In future we 
// can change implementation without impacting other class.
		
		String brand=b1.getBrand();  //protected is like public in package and also 
		//accessible by child class in different package.
		
		String color=b1.color;// only accessible within package
	}

}
