package com.CoreJava.Collection;

import java.util.ArrayList;
import java.util.Collections;


public class Driver {
	
	public static void main(String[] args) {
		Flight f1 = new Flight ("Indigo","09:00",5000);
		Flight f2 = new Flight ("spicejet","13:00",7000);
		Flight f3 = new Flight ("vistara","09:30",5500);
		
		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		System.out.println(flights);
		
		Collections.sort(flights);
		
		System.out.println(flights);
		
		for (Flight flight:flights) {
			System.out.println(flight);
		}
		
		
	}

}
