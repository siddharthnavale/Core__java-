package com.CoreJava.AbstractClassAndMethod;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println(3.14*radius*radius);
// here we inhered abstract method from parent class, now here override 
//it and advantage of overridden method is? , we can access overridden 
//method using parent type reference(loose coupling) by it we can 
//achieve polymorphism
	}

	@Override
	public void perimeter() {
		System.out.println(3.14*radius*2);
		
	}
	

}
