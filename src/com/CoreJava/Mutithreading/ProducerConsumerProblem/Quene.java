package com.CoreJava.Mutithreading.ProducerConsumerProblem;

public class Quene {
	
	int x;
	boolean is_Data_Present=false;
	
	synchronized public void store(int j) {
	try {	
	if(is_Data_Present==false){
		x=j;
		System.out.println("Produced "+ x);
		is_Data_Present=true;
		notify();
	}
	else {
		wait();
	}
	}
	catch(Exception e){
		System.out.println("Some problem occured");
	}
}	
	
	synchronized public void retrive() {
		try {
		if(is_Data_Present==true){
			System.out.println("Consumed "+ x);
			is_Data_Present=false;
			notify();
		}
		else {
			wait();
		}
	}
		catch(Exception e) {
			System.out.println("Some problem occured");
			}
		}
		
		
		
		
	}

