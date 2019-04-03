package com.class14;

public class Question4 {

	public static void main(String[] args) {

		//How to find out the part of the string from a string? What is substring? Find number of words in string?
		
		String str = "One two three fifteen twenty six";
		
		System.out.println(str.substring(5));
		
		
		String[] a = str.split(" ");
		System.out.println("There is "+a.length+" words in String");
		
		
	}

}
