package com.CoreJava.Mutithreading.Problem;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of stalls ");
		int n=scan.nextInt();
		scan.nextLine();  // to avoid buffer
		Stall[] stalls= new Stall[n]; 
		 
		for(int i=0;i<n;i++) {
			String s=scan.nextLine();
			String [] split=s.split(",");// by split method we converting string into array of string.
			stalls[i]=new Stall(split[0],split[1],Integer.parseInt(split[2]),split[3]);// by ParseInt we converting string into int
		}
		
		for(int i=0;i<n;i++) {
			Thread t= new Thread(stalls[i]);
			t.start();
			try {
				t.join();// sometime main thread 1st thread to  1st thread to complete, but sometime you wanted to wait for other threads to 
				//finish its execution and join you till please wait. Main Thread wait for this t to finish it execution and join you then 
				//you(Main Thread) continue 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
			
		double totalCost=0.0;
		for(int i=0;i<n;i++) {
			totalCost=+stalls[i].getStallCost();
			}
		
		System.out.println(totalCost);
			
			
		}
		
	
	}


