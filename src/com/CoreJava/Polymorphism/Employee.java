package com.CoreJava.Polymorphism;

public class Employee extends Student {

	@Override
	public void shedule() {
		System.out.println("Office+ Family Time");
	}

	@Override
	public void travellingMode() {
		System.out.println("By Train");
	}

	@Override
	public void work() {
		System.out.println("Learing + Officework");
	}
	
	

}
