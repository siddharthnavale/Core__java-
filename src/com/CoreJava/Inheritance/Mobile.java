package com.CoreJava.Inheritance;

public class Mobile extends CommunicatinDevice {
	
	//**Inheritance**//
	//again we don't want to implement all feature hence we inherited from  
	// CommunicatinDevice.CommunicatinDevice is parent class so by inheritance we 
	// are reusing code.
		public void takePiture() {
			System.out.println("clicked photo");
		}
	}
