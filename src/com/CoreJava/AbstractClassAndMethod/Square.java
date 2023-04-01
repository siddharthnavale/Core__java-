package com.CoreJava.AbstractClassAndMethod;

public class Square extends Shape {

	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println(side*side);
// here we inhered abstract method from parent class, now here override 
//it and advantage of overridden method is? , we can access overridden 
//method using parent type reference(loose coupling) by it we can 
//achieve polymorphism
	}

	@Override
	public void perimeter() {
		System.out.println(4*side);
		
	}
	
	

}
