package com.class30;

import java.util.ArrayList;

public class ArrListTask {

	public static void main(String[] args) {
		// Create a generic ArrayList that will store 5 names into it.
		//Find out whether the given ArrayList is empty or not?
		//Check whether the specific name is present in an ArrayList or not?
		//Find the size of your arrayList and print all values from that
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Nastya");
		names.add("Aigerim");
		names.add("Sasha");
		names.add("Alijon");
		names.add("Anar");
		
	   System.out.println(names.isEmpty());
	   System.out.println(names.contains("Sasha"));
	   System.out.println(names.size());
	   
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
		//non generic arrayList - we can store different types ofObjects;
		ArrayList alist = new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(100.10);
		alist.add(true);
		alist.add('a');
		
		for (Object value:alist) {
			System.out.println(value);
		}
		
		for (int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		ArrayList <Boolean> booleanArrayList = new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}
		//System.out.println(booleanArrayList);
		

	}
}
