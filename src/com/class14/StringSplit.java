package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// Split
		
		String str="Welcome, Syntax Students Batch 4";
		
		String [] array = str.split("S");
		
		System.out.println(array.length);
		
		for(String substring:array) {
			System.out.println(substring);
		}
		
		
		
		

	}

}
