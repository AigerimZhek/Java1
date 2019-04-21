package com.class26;

public class Employee {
	
	String name, lastName;
	
	public Employee() {
		System.out.println("I am a parent class constructor");
	}
	
	public Employee(String name, String lastName) {
		
		this.name = name;
		this.lastName=lastName;
	}
}


class Tester extends Employee {

	int salary;
	
	public Tester(String name, String lastName, int salary) {
		super(name,lastName);
		this.salary=salary;
	}
	
	public void displayDetails() {
		
		System.out.println("Employee "+lastName+ " "+name+" has a salary of "+salary);
	}
	
}