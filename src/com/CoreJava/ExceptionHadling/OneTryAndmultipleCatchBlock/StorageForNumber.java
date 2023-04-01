package com.CoreJava.ExceptionHadling.OneTryAndmultipleCatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StorageForNumber {

		public static void main(String[] args) {
		   System.out.println("Connection enstablish");
			Scanner scan=new Scanner(System.in);
			try {
			System.out.println("Enter value of a ");
			int a=scan.nextInt();
			System.out.println("Enter value of b ");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("Value of c is : "+c);
			System.out.println("Enter the Size of array ");
			int size=scan.nextInt();
			int [] arr= new int [size];		
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt();
				for(int j=0;i<arr.length;i++) {
					System.out.print(arr[j]+" ");
				}
			}}
			catch (ArithmeticException e){
				System.out.println("Enter non zero value for b");
			}
		
			catch (NegativeArraySizeException e){
				System.out.println("Enter above zero value for size");
			}
			catch (InputMismatchException e){
				System.out.println("Enter valid value for field");
			}
			catch (Exception e){
				System.out.println("Invalid value");
			}
			System.out.println("Connection closed");
		}}	

