package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String without using reverse function
		
		// 1 using toCharArray
		String original = "Today is Java Class";
		System.out.println(original.length());
		String reverse="";
		char[] array=original.toCharArray();
		
		for(int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		}

		System.out.println("Reversed String is: "+reverse);
		
		// 2 using CharAt
		
		String reverse1="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);
		}
		System.out.println(reverse1);
		
		String a="";
		
		// 3 using substring
		for(int i=original.length(); i>0; i--) {
			a=a+original.substring(i-1,i);
		}
		System.out.println(a);
	}
}
