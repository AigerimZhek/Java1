package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class CarsArrList {

	public static void main(String[] args) {
		// Task 1 :
		//Create an arraylist of cars and retrieve all the values using 4 different ways.

		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Mercedes");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Dodge");

		System.out.println("First way------------------------------------");
		
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("Second way------------------------------------");
		
		for(String car:cars) {
			System.out.println(car);
		}
		
		System.out.println("Third way--------------------------------------");
		
		int a=0;
		while(cars.size()>a) {
			System.out.println(cars.get(a));
			a++;
		}
		
		System.out.println("Fourth way------------------------------------");
		
		Iterator <String> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
