package com.class22;

public class Dog {
	String make= "unknown";
	  String model="unknown";
	  int numberOfDoors = 4;
	  int price;
	  int topSpeed = 90;
	  
	  Dog (String make, String model, int numberOfDoors, int price, int topSpeed){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+price+" "+topSpeed);
	  }
}
