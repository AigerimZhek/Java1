package com.class22;

public class StaticVsNonStatic {

	public String name= "John";//instance variable
	public static String lastName = "Snow";//static variable
	
	public static void main(String[] args) {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		
		getInfo1(); // within the same class we can call it by using method/variable name;
		
		System.out.println(lastName);
	}
	
	//non static method - can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		//getInfo1(); - we can access static methods within non static
	}
	//static method - can only have an access to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName); - will get an error
		//Cannot make a static reference to the non-static field name
		System.out.println("I am a static method");
		
		//getInfo(); - we cannot access non static methods within static
	} 
	

}
