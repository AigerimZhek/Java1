package com.class27;

public class Student {
	//Write program as a student class   that has instance variables name and address.
	//Create a constructor that will initialize those variables.
	//Print name & address of given  student by the displayInfo method.
	String name;
	String address;
	
	Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Name is "+name +" address is "+address);
	}

}
	
