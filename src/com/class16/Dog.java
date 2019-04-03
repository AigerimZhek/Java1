package com.class16;

public class Dog {
	
	String breed, name;
	int age, weight;
	
	public static void main(String[] args) {
		
		Dog d1=new Dog();
		
		d1.breed="Husky";
		d1.name="Tuzik";
		d1.age=2;
		d1.weight=15;
		System.out.println("My dogs name is "+d1.name+". It is "+d1.age+" years old");
		d1.bark();
		
		Dog d2=new Dog();
		d2.breed="Bulldog";
		d2.name="Freckles";
		d2.age=5;
		d2.weight=22;
		
		d2.diet();
		
		Dog d3=new Dog();
		d3.breed="Labrador";
		d3.name="Ringo";
		d3.age=10;
		d3.weight=33;
		
		d3.smart();
	}
	
	void bark() {
		System.out.println(name+" can bark");
	}
	void smart() {
		System.out.println(name+" understands the commands");
	}
	void diet() {
		System.out.println(name+" eats only homemade meals");
	}

}
