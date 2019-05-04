package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Words1ArrList {

	public static void main(String[] args) {
		// Task 2 :
		//2.Create an arrayList of words. Remove every word that ends with “e”.

		ArrayList<String> words = new ArrayList<String>();

		words.add("season");
		words.add("cliche");
		words.add("road");
		words.add("clove");
		words.add("mayo");
		words.add("water");
		words.add("olive");

		System.out.println(words);

		Iterator<String> it = words.iterator();

		while (it.hasNext()) {
			String word = it.next();
			if (word.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(words);

		// Task 3:
		//3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

		ArrayList<String> drinks = new ArrayList<String>();

		drinks.add("juice");
		drinks.add("milk");
		drinks.add("rum");
		drinks.add("wine");
		drinks.add("kefir");
		drinks.add("kumis");

		System.out.println(drinks);

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);

		// Task 4:
		//4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i <= 50; i += 2) {

			numbers.add(i);
		}
		System.out.println(numbers);
		
		Iterator<Integer> iter = numbers.iterator();
		
		while(iter.hasNext()) {
			int num = iter.next();
			
			if(num%5==0) {
				iter.remove();
			}
		}
		System.out.println(numbers);

	}

}
