package com.CoreJava.Constructor.InheritanceConstructor;

public class Execute {
	
	
public static void main(String[] args) {
Cat c1=new Cat();// when we make new instance 1st parent constructor
// called then called constructor of child class. this happen because of super()
//if you not tell it explicitly then also complier will add super() it on 1st
// line of constructor.

	Cat c2=new Cat(2,"c2","White");
	
}
}
