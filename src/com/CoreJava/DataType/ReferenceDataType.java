package com.CoreJava.DataType;

import java.util.Date;

public class ReferenceDataType {
	
	public static void main(String[] args) {
		byte a=1;
		
		//In primitive data type, we have 8 data type, example- byte, short, 
		//integer,long,float,double,char and boolean.remaining all are reference 
		//data type.lets write one example.
		
		var now=new Date();
		System.out.println("Todays date is " +now );
		//while using date class, this class in other package so we imported it 
		//** if we using reference data type, we use new keyword to allocate 
		//memory to(now) reference variable(its not required in primitive data type
		//).and by using reference variable we can access its own member(properties
		//and methods). 
		
		String s= "java";
		System.out.println(s.length());
		
	Integer b=4;
	String number= b+"";
	System.out.println(number);
	
		
	}

	

}
