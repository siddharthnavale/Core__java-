package com.CoreJava.AbstractClassAndMethod;

public abstract class Shape {
	// here we know every shape have parameter and area but here we 
// not know about implementation hence we declare methods as abstract.
//abstract methods  become concrete as we go down of hierarchy
	
	public abstract void area();
	
	public abstract void perimeter();
}
