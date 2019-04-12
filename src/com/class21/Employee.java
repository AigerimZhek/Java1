package com.class21;

public class Employee {
	String eID;
	int salary;
	static String CEO = "Sumair";
	
	void Info() {
		System.out.println("Empoyee "+eID+"'s salary is "+salary);;
	}
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		obj1.eID = "BA12578";
		obj1.salary=80000;
		
		obj2.eID="BA12599";
		obj2.salary=78000;
		
		/*
		 * System.out.println("Empoyee "+obj1.eID+"'s salary is "+obj1.salary);
		 * System.out.println("Empoyee "+obj2.eID+"'s salary is "+obj2.salary);
		 */
		
		System.out.println("CEO is "+CEO);
		obj1.Info();
		obj2.Info();
	}

}
