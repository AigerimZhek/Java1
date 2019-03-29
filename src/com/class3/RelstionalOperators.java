package com.class3;

public class RelstionalOperators {

	public static void main(String[] args) {

		int a = 198;
		int b = 198;
		boolean result = a > b;
		boolean result1 = a == b;
		
		System.out.println(result);
		System.out.println(result1);

		
		// compare 2 numbers and if a is larger than b --> print
		if (a != b) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}

		
		
		double shoePrice = 32.99;
		double allowedPrice = 29.99;

		if (shoePrice <= allowedPrice) {
			System.out.println("I am buying these shoes");
		} else {
			System.out.println("I am not buying these shoes");
		}

		System.out.println("That's a great day"); // independent statement

	}

}
