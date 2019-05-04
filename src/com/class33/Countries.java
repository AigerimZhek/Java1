package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> count = new HashMap<>();
		
		count.put("Kazakhstan", "Astana");
		count.put("Russia","Moscow" );
		count.put("USA", "Washington, DC");
		count.put("Paris", "France");
		count.put("South Africa", "CapeTown");
		
		System.out.println("---------Printing keys------------");
		Set<String> countries = count.keySet();
		for(String country:countries) {
			System.out.println(country);
		}
		System.out.println("----------------------------------");
		Iterator<String> it = countries.iterator();
		while(it.hasNext()) {
			String c= it.next();
			System.out.println(c);
		}
		
		
		System.out.println("----------Printing values-----------");
		Collection<String> capitals = count.values();
		for(String capital:capitals) {
			System.out.println(capital);
		}
		System.out.println("------------------------------------");
		it=capitals.iterator();
		while(it.hasNext()) {
			String c = it.next();
			System.out.println(c);
		}
		
		System.out.println("--------------Printing keys and values---------------");
		
		Set<String> countries1 = count.keySet();
		for(String country:countries1) {
			System.out.println(country+" : "+count.get(country));
	}
		
		System.out.println("----------------------------------");
		Iterator<String> it1 = countries.iterator();
		while(it1.hasNext()) {
			String c= it1.next();
			System.out.println(c+" : "+count.get(c));
		}
		
	}

}
