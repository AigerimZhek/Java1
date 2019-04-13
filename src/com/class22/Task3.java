package com.class22;

public class Task3 {
	
	//Write a program  that will have a private default constructor class and create 2 objects of this class:
	//1 - inside same class; 2 - from outside the class.
	
	
	static String weekDay;
	static String month;
	
	private Task3(String day, String month1) {
		weekDay=day;
		month=month1;
	}
	
	static void execute() {
		System.out.println("Today is "+weekDay+" of "+month);
	}
	
	public static void main(String[] args) {
		Task3 obj1 = new Task3("Thursday", "January");
		obj1.execute();
	}

}
