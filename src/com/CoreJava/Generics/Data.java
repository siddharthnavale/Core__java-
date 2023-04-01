package com.CoreJava.Generics;

import java.util.Comparator;

public class Data<T extends Number & Comparable > {
	
private T t;

public Data(T t) {
		this.t = t;
	}
  
public void ShowData() {
	  System.out.println("Class of Data is "+t.getClass().getName());
  }

public T GetData() {
	return t;
	}
 
// as type parameter  we can take anything  which should be child class of 
//number and should implement runnable interface
}
