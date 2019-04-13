package com.class22;

public class Task2 {
	
	//Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	//NOTE: please male different names for instance and local variables
	
	
	String studentName;
	int javaGrade, sqlGrade, gitGrade; 
	
	Task2(String name, int a, int b, int c) {
		studentName=name;
		javaGrade=a;
		sqlGrade=b;
		gitGrade=c;
	}
	
	public void calculateAverage () {
	 int avg = (javaGrade + sqlGrade + gitGrade)/3;
		System.out.println("Student "+studentName+"'s average grade is "+avg);
	}

}
