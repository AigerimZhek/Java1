package com.class26;

public class Student {
	
	String fullName;
	int age;
	
	//this is used to differentiate between local and instance variables
	public Student(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Student's full name is "+fullName+" and the age = "+age);
	}
	public static void main(String[] args) {
		
		Student obj = new Student("John Snow", 30);
		
		obj.displayDetails();
	}

}
