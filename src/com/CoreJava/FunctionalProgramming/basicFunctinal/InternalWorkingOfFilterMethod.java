package com.CoreJava.FunctionalProgramming.basicFunctinal;

import java.util.ArrayList;
import java.util.function.Predicate;

public class InternalWorkingOfFilterMethod implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		
	return (number%2==0);
		
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
		 
		 
	}
	
	

}
