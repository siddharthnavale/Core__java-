package com.CoreJava.Interface;

public interface Calculator {
	
//basically For standardization in method name,we use interface
// * method automatically become abstract,in java we can use default 
//method if we want to update interface without impacting implementing
//class
	
//* if we want everyone should follow my implementation as it is without 
//modification then we use static method.
	
// if we want protect code from outside of class then we use private 
//method 
	
// * variable within interface is automatically public static final.
	
void sum();

void multiply();

}
