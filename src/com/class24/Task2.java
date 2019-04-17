package com.class24;

public class Task2 {
	//Create 1 class with a static method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	public static void main(String[] args) {
		
		Task2.eat(5);
		Task2.eat("Pizza");
		Task2.eat(6, "Ice cream");
	}
	
	static void eat(String str) {
		System.out.println("I love eating "+str);
	}
	static void eat(int a, String str) {
		System.out.println("I love "+a+" "+str);
	}
	static void eat(int num) {
		System.out.println(num+" burgers is not enough for me");
	}

}
