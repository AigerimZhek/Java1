package com.class14;

public class Question1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		
		int a=10;
		int b=30;
		a=a+b;//30+10=40
		b=a-b;//10=40-30
		a=a-b;//30=40-10
		
		System.out.println(a+","+b);
		
		
		String str1="christmas";
		String str2="street";
		
		str1=str1+str2;//christmasstreet
		
		
		
		str2=str1.substring(0,str1.length()-str2.length());//street
		str1=str1.substring(str2.length());//christmas
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		

	}

}
