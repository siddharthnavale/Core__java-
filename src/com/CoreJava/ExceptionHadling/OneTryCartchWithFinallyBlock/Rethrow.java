package com.CoreJava.ExceptionHadling.OneTryCartchWithFinallyBlock;

import java.util.Scanner;

public class Rethrow {
	
public void takeInput() throws Exception{// by throws keyword code we are giving 
//warning to who will call (takeInput()) this method.
	Scanner scan=new Scanner(System.in);
	try {
	System.out.println("Enter a value of a");  
	int a= scan.nextInt();
	System.out.println("Enter a value of b");
	int b= scan.nextInt();
	int c=a/b;
	System.out.println("Value of c :-"+c);
	}
	catch(Exception e){ // if any exception happen in try block then it will
//	catch by catch block after catching what should we want to execute that 
//will put in catch block
		System.out.println("Enter a valid value");
		throw e;// by throw we are again throwing exception object to caller,
//disadvantage is below it line will not execute hence we will use finally.
	}
	finally {
	scan.close();
	}
	
	
	
}
	
	
	

}
