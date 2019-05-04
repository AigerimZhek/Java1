package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		System.out.println(numbers.size());//1
		
		numbers.add(0,13);//moves -->  12 will be moved to index 1, and 13 will replace it at index 0;
		System.out.println(numbers.size());//2
		
		numbers.add(0,14);
		System.out.println(numbers.size());//3
		
		for(Integer ii:numbers) {
			System.out.println(ii);//14,13,12
		}
		
		numbers.set(1, 33);//replaces the number at index 1 (13);

		System.out.println(numbers.contains(33));
	
	
	for(Integer ii:numbers) {
		System.out.println(ii);
	}
	
	Iterator<Integer> num = numbers.iterator();
	//hasNext(); next(); remove();
	while(num.hasNext()) {
		System.out.println(num.next());
	}
	
	int c=0;
	while(numbers.size()>c) {
		System.out.println(numbers.get(c));
		c++;
	}

}
}
