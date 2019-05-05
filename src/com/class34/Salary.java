package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Salary {

	public static void main(String[] args) {
		
		Map<String, Integer> employees = new HashMap<>();
		
		employees.put("Andy Stone", 88000);
		employees.put("Anna Deutsch", 99000);
		employees.put("Susan White", 120000);
		employees.put("Maddie Smith", 75000);
		employees.put("Stephanie Diaz", 92000);
		employees.put("Katie Brown", 110000);
		
		System.out.println("\n" +employees);
		int max = 0;
		String key=null;
		
		
		
		for (Map.Entry<String, Integer> entry: employees.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				key = entry.getKey();
			}
		}
		
		System.out.println("\n" + key + " " + max);
		
		
		
		//for(String i:employees.keySet()) {
		//	if(employees.get(i)>max) {
		//		max=employees.get(i);
		//	}	
			
		//}System.out.println(max);

	}

}
