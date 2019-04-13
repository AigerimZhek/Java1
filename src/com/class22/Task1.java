package com.class22;

public class Task1 {
	
	//Write a program that will have a constructor:
	//one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	
	
	String objName;
	int objAge;
	
	Task1 (String name, int age) {
		objName=name;
		objAge=age;
	}
	Task1 () {
		
		System.out.println("Hi!!!");
		
	}
	
	public void getInfo () {
		System.out.println("My name is "+objName+" my age is "+objAge);
	}

}
