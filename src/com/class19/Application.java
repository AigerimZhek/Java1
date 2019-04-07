package com.class19;

public class Application {
	public static void main(String[] args) {
		
		Human person1 = new Human();
		
		person1.print();//brown --> original statement
		person1.eyeColor="Pink"; //pink --> has been changed
		person1.print(); // pink --> has changed because it executes from top to the bottom;
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		
		Human person2 = new Human();
		
	//	person2.eyeColor="Orange";
		System.out.println(person2.eyeColor); // pink, because int is static which means that the changes we made changed the whole code
		System.out.println(person2.height);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
		
	}

}
