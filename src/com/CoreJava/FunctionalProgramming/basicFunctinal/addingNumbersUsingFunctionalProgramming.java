package com.CoreJava.FunctionalProgramming.basicFunctinal;

import java.util.ArrayList;

public class addingNumbersUsingFunctionalProgramming {
	
	public static void Addition(ArrayList<Integer> number) {
		
		int sum =number.stream().reduce(0,
								(num1,num2) -> num1 + num2);
		System.out.println(sum);
	}
	
	public static void sumOfEvenNumber(ArrayList<Integer> number) {
		
		int sum= number.stream()
				.filter(num -> num% 2==0)
				.reduce(0,
						(num1,num2) ->num1+ num2);
		System.out.println(sum);
		
	}

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		 numbers.add(1);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.add(4);
		 numbers.add(5);
		 numbers.add(6);
		 numbers.add(7);
		 numbers.add(8);
		 numbers.add(9);
		 numbers.add(10);
		 
		 Addition(numbers);
		 sumOfEvenNumber(numbers);
		 
		 //
	}
}
