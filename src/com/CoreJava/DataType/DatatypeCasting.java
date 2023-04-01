package com.CoreJava.DataType;


public class DatatypeCasting {
	
	public static void main(String[] args) {
		
		byte a= 4;
		double b=a;// here we are storing smaller size in larger size so here 
		// not required to mention casting here this conversion happen automatically.
		 System.out.println("Value of a is " + a );
			
		 System.out.println("Value of b is " + b );
		 
		 double c =10.45;
		 byte d=(byte)c;//here we storing larger size in smaller size data type.
		 //this will not be converted automatically so we need tell it explicitly
		 //if we not tell it explicitly then compilation error will come.
		 
		 
		 System.out.println("Value of c is " + c );
			
		 System.out.println("Value of d is " + d );
		 
		 
		 
	}

}