package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValues {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Nastya");
		names.add("Aigerim");
		names.add("Sasha");
		names.add("Alijon");
		names.add("Anar");
		
		//1 way - for loop
		System.out.println("-------------For loop-------------");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//2 way - using advanced loop
		System.out.println("-------------For each loop-------------");
		for(Object name:names) {
			System.out.println(name);
		}
		
		
		System.out.println("------------Iterator-------------");
		//3 way - using iterator
		Iterator <String> it = names.iterator();
		//boolean check = it.hasNext();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	
		
	}
}
