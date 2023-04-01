package com.CoreJava.Interface;

import java.util.Scanner;

public class Implementing2 implements Calculator{
	
	Scanner scan =new Scanner(System.in);

	@Override
	public void sum() {
		System.out.println("Enter the value of a");
		double a=scan.nextDouble();
		System.out.println("Enter the value of b");
		double b=scan.nextDouble();	
		
		System.out.println("Sum is ::"+  (a+b) );
		}

	@Override
	public void multiply() {
		System.out.println("Enter the value of a");
		double a=scan.nextDouble();
		System.out.println("Enter the value of b");
		double b=scan.nextDouble();		
		
		System.out.println("Multiplication is ::"+  (a*b) );
		
	}

}
