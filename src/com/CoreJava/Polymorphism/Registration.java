package com.CoreJava.Polymorphism;

public class Registration {
	
	public static  void registration(Student ref) {
///By loss coupling only we can achieve polymorphism so we here,
// we given parent type reference(Student ref). 
		ref.work();
		ref.shedule();
		ref.travellingMode();
		}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		Employee e= new Employee();
		Entrepreneur e1=new Entrepreneur();
		
		Registration.registration(s);
		System.out.println("---------------------------");
		Registration.registration(e);
		System.out.println("---------------------------");
		Registration.registration(e1);
		
		
		
		
		
		
	}
	

}
