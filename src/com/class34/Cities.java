package com.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Cities {

	public static void main(String[] args) {

		String[] arr = { "Kostanay", "London", "Moscow", "Miami", "Toronto", "DC", "Lima" };

		Map<String, Integer> cities = new TreeMap<>();

		for (String city : arr) {
			cities.put(city, city.length());
		}

		System.out.println(cities);

		Set<Map.Entry<String, Integer>> set = cities.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();

		// You do the removal first then you loop through and print
		while (it.hasNext()) {

			Entry<String, Integer> entry = it.next();

			if (entry.getValue() > 5) {
				it.remove();
			}
		}
// Loop for printing  

		for (Entry<String, Integer> entry : set) {
			String me = entry.getKey() + " " + entry.getValue();

			System.out.println(me);
		}

		/*
		 * Iterator<Map.Entry<String,Integer>> it2 = set.iterator(); while
		 * (it2.hasNext()) {
		 * 
		 * Entry<String, Integer> entry = it2.next();
		 * 
		 * String me = entry.getKey() + " " + entry.getValue();
		 * 
		 * System.out.println(me); }
		 */
		// Print set here instead of cities cos you have already converted it to a city
//        System.out.println(set);

		/*
		 * while(it.hasNext()) {
		 * 
		 * Entry<String, Integer> entry = it.next(); if(entry.getValue()>5) {
		 * it.remove(); } String me = entry.getKey()+" "+entry.getValue();
		 * 
		 * System.out.println(me); } System.out.println(cities);
		 */
	}
}
