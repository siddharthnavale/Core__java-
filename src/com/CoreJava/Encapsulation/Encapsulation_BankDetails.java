package com.CoreJava.Encapsulation;

public class Encapsulation_BankDetails {
	
	private int balence; //here we created data member.

	public int getBalence() {
		return balence;
	}

	public void setBalence(int balence) {
		if(balence>=0) {
		this.balence = balence;
		}
//The data members are important component so we making it private by that we 
//preventing from direct access,and we providing controlled access by help
//getter and setter and to prevent from invalid values of balance we provided if 
//block in setter	
	}
	
}