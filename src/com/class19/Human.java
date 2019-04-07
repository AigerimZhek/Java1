package com.class19;

public class Human {
	static String eyeColor = "Brown";
	int height = 6;
	int weight = 180;
	String gender = "F";
	String progLanguage;
	
	void speak() {
		String language = "English";
		System.out.println("Humans can speak "+language);
	}
	void coding() {
		System.out.println("Syntax students can code "+progLanguage);
	}
	
	void print() {
		System.out.println(eyeColor);
	}
	public static void main(String[] args) {
		Human person = new Human();
		
		System.out.println(person.eyeColor);
		System.out.println(person.height);
		System.out.println(person.weight);
		System.out.println(person.gender);
	}

}
