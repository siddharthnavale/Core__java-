package com.CoreJava.Generics;

import java.util.ArrayList;

public class GenricMethod {
	
	 public static void sorting(ArrayList <Integer> number) {
		
		 number.stream()
		 .sorted()
		 .forEach(e -> System.out.println(e));
		 
	 }
	 
	 public static void print(ArrayList <?> number) {
			
		 number.add(null);
		 number.stream()
		 .forEach(e -> System.out.println(e));
		 
	 }
	 
	 public static void printNumbers(ArrayList <? extends Comparable> number) {		
		 number.add(null);
		 number.stream()
		 .forEach(e -> System.out.println(e));
		 
	 }
	 
	 public static void main(String[] args) {
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
		 
		 ArrayList<String> s= new ArrayList<String>();
		 
		 
		// sorting(numbers);
		// print(numbers);
		//System.out.println("-----------------------");
		//print(s);
		 printNumbers(numbers);
		 System.out.println("-----------------------");
		 printNumbers(s);
		 
		 // 
	}

}
