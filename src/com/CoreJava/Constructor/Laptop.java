package com.CoreJava.Constructor;

public class Laptop {

	private String ram;
	private String harddisk;
	private String os;
	private String screentouch;
	private String cooling;
// Constructor is basically special method.and we can overload constructor
//constructor overloading is required so that we can initialize object differently.
	public Laptop(String ram, String harddisk, String os) {
		// this.ram = ram;
		// this.harddisk = harddisk;
		// this.os = os;
// we can create constructor as above or we can use this keyword
		this(ram, harddisk, os, null, null);

	}

	public Laptop(String ram, String harddisk, String os, String screentouch, String cooling) {
		this.ram = ram;
		this.harddisk = harddisk;
		this.os = os;
		this.screentouch = screentouch;
		this.cooling = cooling;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", harddisk=" + harddisk + ", os=" + os + ", screentouch=" + screentouch
				+ ", cooling=" + cooling + "]";
	}

}
