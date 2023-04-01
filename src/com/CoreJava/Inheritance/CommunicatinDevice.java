package com.CoreJava.Inheritance;

public class CommunicatinDevice {
	//here we define all common behavior in single class so we can inherit.
	//**Object Class**//
	// if we not explicitly tell (extends Object) java compiler automatically add 
	//this for us. That's reason every class has additional methods. 
	//**Member of object class**//

	//* equal method use for compare object.

	//* hashCode method which returns a integer based on the address of this object 
	//in the memory.
	//Note-Address of object goes to a special function called as hash function. job 
	// of this function to get value and map it to a numeric value which we called as 
	//hash.
	//Note- hashCode use in lot of situation one of them comparing object for 
	//equality.

	//*toStringMethod which returns a string representation of object.
	//(nameofclass@hasCode) <- this hashCode in hexadecimal form.
		

		
		public void makecall() {
			System.out.println("Calling");
		}
		
		public void sendMassage() {
			System.out.println("Sending massage");
		}

	}
