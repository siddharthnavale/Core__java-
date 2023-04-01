package com.CoreJava.StaticMember;

public class StaticMember {
	
	public static Double priceOfPetrol;
	//priceOfPetrol remain same for all object hence make it as static.
	
	public int mileageOfCar;
	//mileageOfCar is depend on car object hence we make it instance variable
	
	static {
		priceOfPetrol=106.49;
	}
 //by static block we can initialize static variables
	
	public StaticMember(int mileageOfCar) {
	this.mileageOfCar = mileageOfCar;
}
	//above code for constructor where we initialize the object
	
	public static void kmToMiles(double Km) {
		double noOfMiles =0.621371*Km;
		System.out.println(noOfMiles);
		} 

	// this method is not depend on object hence we make it static method.
	
	public void moneyRequiredTravelCertainDistance(double Km) {
		double moneyRequiredTravelCertainDistance= (priceOfPetrol*Km)/mileageOfCar;
	    System.out.println(moneyRequiredTravelCertainDistance);
	}
	//this method is depend on object hence we make it instance method.
}
