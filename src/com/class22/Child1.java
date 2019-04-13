package com.class22;

public class Child1 extends Parent{

	String hairType="Curly";
	public static void main(String[] args) {
		Child1 obj = new Child1();
		System.out.println("Child 1 eye color is "+obj.eyeColor);
		System.out.println("Child 1 hair color is "+obj.hairColor);
		System.out.println("Child 1 has "+obj.nose+" nose");
		obj.sing();
		obj.playTennis();
		
		Parent parentObj = new Parent();
		//parentObj.hairType --> not accessible in  Parent class;
		//parentObj.playTennis() --> not accessible in Parent class;
	}
	
	

}
