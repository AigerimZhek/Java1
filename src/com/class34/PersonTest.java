package com.class34;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {

		Map<Integer, Person> info = new HashMap<>();

		info.put(123, new Person("Aigerim", "Z", 23, 250000.0));
		info.put(234, new Person("Andrew", "Time", 32, 270000.0));
		info.put(356, new Person("Annie", "Clay", 23, 140000.0));

		
		Set<Map.Entry<Integer,Person>> set = info.entrySet();
		for(Map.Entry<Integer, Person> entry:set) {
			System.out.print(entry.getKey()+" ID "); 
			entry.getValue().getInfo();
		}
		 

	}

}
