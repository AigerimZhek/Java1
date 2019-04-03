package com.class14;

public class Question5 {

	public static void main(String[] args) {

		//Write a java program to reverse String? Reverse a string word by word?
		
		String str = "Today is a nice day";
		String[] a= str.split(" ");
		String reverse="";
		
		for(String b:a) {
			for(int i=b.length()-1; i>=0; i--) {
				reverse=(reverse+b.charAt(i));
				
			}
			reverse= reverse + " ";
		}
		
		System.out.println(reverse);
		
	}

}
