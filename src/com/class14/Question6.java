package com.class14;

public class Question6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is Palindrome or not?

		String str = "level";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println(str + " is a palindrome word");
		} else {
			System.out.println(str + " is not a palindrome word");
		}

	}

}
