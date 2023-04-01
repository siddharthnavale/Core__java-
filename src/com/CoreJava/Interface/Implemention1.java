package com.CoreJava.Interface;

public class Implemention1 implements Calculator{
 
	public int a;
	public int b;
 
	public Implemention1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void sum() {
		System.out.println("Sum is ::"+  (a+b) );
	}

	@Override
	public void multiply() {
		System.out.println("Multiplication is ::"+  (a*b) );
		
	}

}
