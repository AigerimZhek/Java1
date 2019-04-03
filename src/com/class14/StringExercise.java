package com.class14;

public class StringExercise {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str = "Today is Saturday and it's sunny";
		
		
		String a = str.replaceAll(" ", "/");
		System.out.println("String without spaces: "+a);
		
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str1="4555$## Friday5/6 $";
		
		String b=str1.replaceAll("[^A-Za-z]", "");
		System.out.println("There are "+b.length()+" alpha characters in the String");
		
		
		//You have a String str2=“Is it Saturday! Is it raining! Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String str2="Is it saturday! Is it raining! Do we have a Java Class today?";
		
		String [] c =str2.split("!");
			System.out.println("There are "+c.length+" sentences in the String");
		
		

	}

}
