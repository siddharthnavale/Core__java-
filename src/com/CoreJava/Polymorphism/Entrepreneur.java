package com.CoreJava.Polymorphism;

public class Entrepreneur extends Student {

	@Override
	public void shedule() {
		System.out.println("Office  + Meeting + family time");
	}

	@Override
	public void travellingMode() {
		
		System.out.println("Bike or Car");
	}

	@Override
	public void work() {
		
		System.out.println("Learning + Office Work+ Meeting +Arrange resource");
	}

}
