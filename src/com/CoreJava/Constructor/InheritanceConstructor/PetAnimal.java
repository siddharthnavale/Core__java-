package com.CoreJava.Constructor.InheritanceConstructor;

public class PetAnimal {
	
	private int animalId;
	private String name;
	private String colour;
	
	
	public PetAnimal() {
		System.out.println("Inside PetAnimal Constructor ");
	}


	public PetAnimal(int animalId, String name, String colour) {
		this.animalId = animalId;
		this.name = name;
		this.colour = colour;
		System.out.println("Inside PetAnimal parameterized Constructor");
		
		
	}
	
	
	
	
	

}