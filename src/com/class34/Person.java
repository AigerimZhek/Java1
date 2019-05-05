package com.class34;

public class Person {
	/*
	 * Create a Person class with following private fields: name, lastName, age,
	 * salary. Variables should be initialized through constructor. Inside the class
	 * also create a method to print user details. In Test Class create a Map to
	 * store personId and a Person Object. Print each object details.
	 */

	public String name;
	public String lastN;
	public int age;
	public double salary;
	
	public Person(String name,String lastN, int age, double salary) {
		this.name=name;
		this.lastN=lastN;
		this.age=age;
		this.salary=salary;
	}
	
	public void getInfo() {
		System.out.println(name+ " "+lastN+"'s age is "+age+" and salary = "+salary);
	}

}
