package com.CoreJava.HankerRank;

import java.util.Scanner;

public class problem1 {

	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             System.out.print(s1);
             if (s1.length()<15){
                 for(int j=1;j<=(15-s1.length());j++){
                    System.out.print(" "); 
                 }
             }
             String number =x+"";
             if (number.length()<3){
                 for(int j=1;j<=(3-number.length());j++){
                    System.out.print("0"); 
                 }}
                 System.out.print(number);
                 System.out.println();
             //Complete this line
         }
         
         System.out.println("================================");

 }
}
