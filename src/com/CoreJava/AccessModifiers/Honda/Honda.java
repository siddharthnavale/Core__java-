package com.CoreJava.AccessModifiers.Honda;


import com.CoreJava.AccessModifiers.Bike;

public class Honda extends Bike{
	public static void main(String[] args) {
		
		Honda h1=new Honda(); 
		Bike b1=new Bike();
	 
		 
		 int BikeId=b1.BikeId;// public accessible everywhere
			
		//float cc=h1.cc; //access modifier of cc is private hence it not visible
	//outside a class. we use private to hide implementation of class.In future we 
	// can change implementation without impacting other class.
			
      System.out.println(h1.brand);//protected is like public in package and also 
			//accessible by child class in different package .
			
	//String color=h1.color;// only accessible within package
      
//  So the main difference between default access modifiers and the protected modifier is that default
//members are accessible only in the current package. While protected members can be accessed
//anywhere in the same package and outside package only in its child class and using the child class’s
//reference variable only, not on the reference variable of the parent class. We can’t access protected
//members using the parent class’s reference.
		}

		 
	}
	


