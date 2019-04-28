package com.class30;

public class Car {

	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned ar price
	 * should include 10%discount, otherwise 20%discount. The Sedan class has field
	 * as length and also does it is own implementation of calculateSalePrice(): if
	 * length of sedan is >20 feet then returned car price should include
	 * 5%discount, otherwise 10%discoun
	 */
	
	double carPrice;
	String color;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;
	}
	
	public double calcSalePrice() {
		return carPrice;
	}
}

class Sedan extends Car{
	int length;

	public Sedan (int length, String color, double carPrice) {
		super(color,carPrice);
		this.length=length;
	}
		
	public double calcSalePrice() {
		
		if(length>20) {
			carPrice=carPrice-(carPrice*5)/100;
		}else {
			carPrice=carPrice-(carPrice*10)/100;
		}
		return carPrice;
	}
	
}

class Truck extends Car{

	int weight;

	public Truck (int weight, String color, double carPrice) {
		super(color,carPrice);
		this.weight=weight;
	}
	
	public double calcSalePrice (){
	
		if(weight>2000) {
			carPrice=carPrice-(carPrice*10)/100;
		}else {
			carPrice=carPrice-(carPrice*20)/100;
		}
		return carPrice;
	}
}

