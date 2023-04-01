package com.CoreJava.Interface;

public class Execute {
	
	public static void perform(Calculator ref) {
// here we create parent type reference (Calculator ref) to achieve
// polymorphism. we can just create reference of interface, we can't
// create object of interface.
		ref.sum();
		ref.multiply();
		
	}
	
	public static void main(String[] args) {
		 
		Implemention1 i1= new Implemention1(3,4);
		Implementing2 i2= new Implementing2();
		
		Execute.perform(i1);
		Execute.perform(i2);
		
		
		
		
		
		
	}
	
	

}
