package com.CoreJava.FunctionalProgramming.basicFunctinal;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;

public class FilterUsingFunctionalPrograming {
	
	public static void printStartwithS(ArrayList<String> name) {
		
		name.stream()
		.filter(e -> e.startsWith("S"))
		.forEach(e-> System.out.println(e));
			
	}
	
	public static void printEvenNumber(ArrayList<Integer> numbers) {
		
		numbers.stream()
		.filter(new InternalWorkingOfFilterMethod ())
		.forEach(e -> System.out.println(e));
	}
	
	public static void sortDistinctPrintElements(ArrayList<Integer> numbers) {
		
		numbers.stream()
		.distinct()
		.sorted()
		.forEach(e -> System.out.println(e));
	}
	
	public static void printSquare(int n ){
		
		IntStream.range(1, n)
		.map(num -> num*num)// we creating definition for apply method
		.forEach(System.out::println);
		
	}
	
	public static void maxValue(ArrayList<Integer> numbers) {
		
		int max=numbers
				 .stream()
				 .max((n1,n2)-> Integer.compare(n1,n2)).get();
		 System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> name= new ArrayList<String>();
		 name.add("Siddharth");
		 name.add("rohit");
		 name.add("Java");
		 name.add("Sql");
		 name.add("Spring Boot");
		 
		// printStartwithS(name);
		 
		 ArrayList<Integer> numbers= new ArrayList<Integer>();
		 numbers.add(41);
		 numbers.add(24);
		 numbers.add(35);
		 numbers.add(47);
		 numbers.add(95);
		 numbers.add(86);
		 numbers.add(37);
		 numbers.add(28);
		 numbers.add(19);
		 numbers.add(19);
		 
		 //printEvenNumber(numbers);
		 
		 //sortDistinctPrintElements(numbers);
		
		 printSquare(6);
		 
	 // maxValue(numbers);
	  
		 // method reference also work with method which being called on instance
		
	}

}
