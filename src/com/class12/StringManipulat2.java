package com.class12;

public class StringManipulat2 {

	public static void main(String[] args) {
		//contains() --> checks for specific value in the string
		//if the value is present -->true, else-->false

		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains);//true
		
		String present="Welcome, Asel";
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);//true

		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);//false
		
		//StartsWith and EndsWith
		String str1="syntax";
		boolean starts=str1.startsWith("s");//true
		System.out.println(starts);
		
		System.out.println(str1.endsWith("o"));//false
		
		//isEmpty()
		
		String str2="hello";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		str2="";
		System.out.println(str2.isEmpty());
		
		//concat() --> will concatenate 1 string to the end of another
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//trim()--> eliminates the spaces at the beginning and at the end of your string;
		String expected= "You may qualify for a multi-policy discount!";
		String actual="   You may qualify for a multi-policy discount!  ";
		
		//System.out.println(expected.contentEquals(actual));
		
		actual=actual.trim();
		System.out.println(expected.contentEquals(actual));
		
		
	}

}
