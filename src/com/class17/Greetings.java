package com.class17;

public class Greetings {

	public static void main(String[] args) {


		Greetings obj=new Greetings();
		obj.hello();// calling the method hello
		
		//how to find largest number
		obj.findLargest(20, 10);//calling method findLargest and passing values 20 & 10
		obj.findLargest(55, 77);
		obj.findLargest(5, 4);
		
		
		obj.helloToInstructor("Asel"); //will print "Hello Asel"
		obj.helloToInstructor("Arif"); 
		
		
	}
	
	void hello()/*inside the brackets - parameters*/ {
		System.out.println("Hello");//method body
	}//method 
	
	void helloToInstructor(String name) {
		System.out.println("Hello "+name);
	}
	
	void findLargest(int a, int b) {
		
		
		if(a>b) {
			System.out.println("A is larger that B");
		}else {
			System.out.println("B is larger than A");
		}
	}
	
	

}
