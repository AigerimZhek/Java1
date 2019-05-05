package com.class34;

public class Car {
	
	public String model;
	public String make;
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	
	public void carDetails() {
		System.out.println(make+" "+model);
		
	}
	

}
