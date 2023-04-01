package com.CoreJava.ExceptionHadling.OneTryCartchWithFinallyBlock;

public class Execute {
 public static void main(String[] args) {
	 Rethrow r=new Rethrow();
	 try {
	 r.takeInput();
	 }catch(Exception e) {
		 System.out.println("Excption handled in main method");
	 }
}
}
