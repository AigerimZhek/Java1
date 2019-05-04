package com.class33;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RetrieveValueFromSet {

	public static void main(String[] args) {
		
		Set <String> cars = new LinkedHashSet<>();
		
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		
		System.out.println("Set collection: "+cars);
		
		//1 way --> converting to ArrayList
		
		// a - to add collection into ArrayList
		List <String> list = new ArrayList<>(cars);
		System.out.println("List collection: "+list);
		System.out.println(list.get(2));
		
		// b - using addAll method
		List <String> list2 = new ArrayList<>();
		list2.addAll(cars);
		System.out.println("List2 collection: "+(list2));
		
		//2 way --> converting into Array
		
		Object[] array=cars.toArray();
		System.out.println(array[1]);
		
		
		
		

		
	}

}
