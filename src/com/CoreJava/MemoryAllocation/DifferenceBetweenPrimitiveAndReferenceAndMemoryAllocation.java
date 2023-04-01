package com.CoreJava.MemoryAllocation;

import java.awt.Point;

public class DifferenceBetweenPrimitiveAndReferenceAndMemoryAllocation {
	
	public static void main(String[] args) {
	
	int x=10; // here we intialize primitive data type.
	
	int y=20;// here we intialize primitive data type.
	
	System.out.println("Value of x is " + x );
	
	System.out.println("Value of y is " + y );
	// if we changes x value it will not affect y values, or vice versa.they are
	// not dependent on each other
	
	// now we above situation we will put on reference data type.
	
	Point p1=new Point(10,20);// here we created object, when we say new 
	//memory allocated on heap segment and it have address. its address is stored 
	//in p1(p1 is on stack frame of main and this stack frame of main is on stack 
	//segment).
    System.out.println("Value of x is " + p1.x );
	
	System.out.println("Value of y is " +p1.y );
	Point p2=p1; //Here we simply copied the address in p2. so object is same
	//and both reference variable pointing to same object. we can change
	// object's value using any reference variable. lets do it.
	
	p2.x=40;
	p2.y=50;
	
    System.out.println("Value of x is " + p1.x );
	
	System.out.println("Value of y is " + p1.y );
	
	}	
//if execution of main method is done, then variable on stack frame got 
//deallocated so after deallocation no one is pointing to (point) object so this
//garbage object's memory gets deallocated and this deallocation done by garbage 
//collector
}
