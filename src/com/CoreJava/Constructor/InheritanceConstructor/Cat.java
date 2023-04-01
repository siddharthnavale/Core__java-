package com.CoreJava.Constructor.InheritanceConstructor;

public class Cat extends PetAnimal {

	public Cat() {
		super();//super() used to call a constructor of parent class
		System.out.println("inside child costructor");
	}
	
	
	public Cat(int animalId, String name, String color) {
		super(animalId,name,color);// if you want to call parameterized constructor
	//of parent class then explicitly tell super(animalId,name,color);
		
		
		System.out.println("inside child parameterized costructor");
	}

}
