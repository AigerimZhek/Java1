package com.class14;

public class Question3 {

	public static void main(String[] args) {

		// Find out how many alpha characters present in a string?

		String str1 = "4555$## Friday5/6 $";

		String b = str1.replaceAll("[^A-Za-z]", "");
		System.out.println("There are " + b.length() + " alpha characters in the String");
	}

}
