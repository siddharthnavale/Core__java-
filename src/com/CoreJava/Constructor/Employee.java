package com.CoreJava.Constructor;

public class Employee {
	 
	private String name;
	private int employeeId;
	private String technology;
	
//if we not give constructor then Automatically default constructor 
//it will initialize field with invalid(default) state.
	
	public String getName() {
		return name;
	}
	public Employee(String name, int employeeId, String technology) {
	//this.name = name;
	//this.employeeId = employeeId;
	//this.technolgy = technology;
//** if we use above commented code then also object will create with invalid
//state so we using setter in constructor
		setName(name);
		setEmployeeId(employeeId);
		setTechnolgy(technology);
// if once we create employee object then we don't want to change field so we 
// will make setter as private.
}
// once we created custom constructor then automatically default constructor 
//will not generate.basically constructor use to initialize object, if not 
//given custom constructor then for initialize we want use setter.
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		if (employeeId>0) {
		this.employeeId = employeeId;}
	}
	public String getTechnolgy() {
		return technology;
	}
	public void setTechnolgy(String technolgy) {
		this.technology = technolgy;
	}
	
	
	

}
