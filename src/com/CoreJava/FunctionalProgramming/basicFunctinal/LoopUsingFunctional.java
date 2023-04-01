package com.CoreJava.FunctionalProgramming.basicFunctinal;

import java.util.ArrayList;

public class LoopUsingFunctional {
	
	
	public static void printUsingFunctional(ArrayList<String> name) {
		name.stream().forEach(e -> System.out.println(e));
	}

	public static void main(String[] args) {
		 ArrayList<String> name= new ArrayList<String>();
		 name.add("Siddharth");
		 name.add("rohit");
		 name.add("Java");
		 name.add("Sql");
		 name.add("Spring Boot");
		 
		 printUsingFunctional(name);
	}
}
