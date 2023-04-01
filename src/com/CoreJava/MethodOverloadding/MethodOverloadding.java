package com.CoreJava.MethodOverloadding;

public class MethodOverloadding {
	
public void print(int a) {
	System.out.println(a);
}
//Method Overloading is more than one method having the same name. 

public void print(double a) {
	System.out.println(a);
}
//Rule 1-Number of parameter of Overloaded method should be different.
//Rule 2- If  number of parameter is same then it type should be different.
//Rule 3-If number of parameter and type of parameter is same then it sequence 
//should be different.  

public void print(String a,double b) {
	System.out.println(a+" "+b);
}

public void print(double b,String a) {
	System.out.println(b+" "+a);
}

public void print(int a,double b,String c) {
	System.out.println(a+" "+b+" "+c+" ");
}
}
