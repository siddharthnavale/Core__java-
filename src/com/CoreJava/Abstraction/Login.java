package com.CoreJava.Abstraction;


public class Login{


	//Abstraction- by it we hide implementation details of class
//and hiding unnecessary details and it reduce complexity.
   
	public String check(String UserId,String Password) {
		if(CheckPassword(Password) && CheckUserId(UserId)) {
			return "Log in Successfully";
		}
		else {
			return "Enter valid Password and UserId";
		}
		}

	private boolean CheckUserId(String UserId) {
		if (UserId=="Siddharth") {
		return true;}
		else {
			return false;
		}
//***reduce Coupling***//
//Here we made this method as private,this method are we not using in 
//other class so we made it private, by it we have less coupling.same
//thing occur in below method [CheckPassword(String Password)]. if made change in
//CheckUserId(String UserId) and CheckPassword(String Password) in this two
//method it will not affect [check(String UserId,String Password)]method calling 
// class.if its affect then its bad design.
	}

	private boolean CheckPassword(String Password) {
		if (Password=="Google") {
			return true;}
			else {
				return false;
			}
	}
	

}
