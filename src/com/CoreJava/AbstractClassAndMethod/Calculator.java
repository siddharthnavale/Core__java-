package com.CoreJava.AbstractClassAndMethod;

public class Calculator {
	
	static void calculte(Shape ref) {
		ref.area();
		ref.perimeter();	
	}

	public static void main(String[] args) {
	Circle c= new Circle(3);
	Square s=new Square(3);
	
	//by  
	
	Calculator.calculte(c);
	Calculator.calculte(s);
	
	
		
		
		
	}
}
