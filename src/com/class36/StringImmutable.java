package com.class36;

public class StringImmutable {

	public static void main(String[] args) {
		// 2 ways to create a string
		//1. using string literal:
		String str = "Hello";
		
		//2.
		
		String str2 = new String("Bye");
		
		str = str.toUpperCase();
		System.out.println(str);
		
		
		str = str.toUpperCase().replace('O', 'a');
		System.out.println(str);

	}

}
