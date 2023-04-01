package com.CoreJava.Generics;

public class Execute {
	
public static void main(String[] args) {
	
	Data <Double> s=new Data<Double>(5.6);
	s.ShowData();
	System.out.println(s.GetData());
	
	System.out.println("------------------------------");
	
	Data <Integer> i=new Data<Integer>(1);
	i.ShowData();
	System.out.println(i.GetData());
}

}
