package com.class22;

public class Child2 extends Parent{

	public static void main(String[] args) {

		
		Child2 obj3 = new Child2();
		Parent obj2 = new Parent();
		obj2.hairColor="Brown";
		System.out.println("Child 2 eye color is "+obj2.eyeColor);
		System.out.println("Child 2 hair color is "+obj2.hairColor);
		System.out.println("Child 2 nose is "+obj2.nose);
		
		obj2.sing();
		obj3.swim();
	}
	
	public void swim () {
		System.out.println("Child 2 can swim");
	}

	
	
}
