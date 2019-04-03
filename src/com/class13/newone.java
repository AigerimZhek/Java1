package com.class13;

import java.util.Scanner;

public class newone {
	public static void main(String[] args) {
	
		
		// Create a String and print it in reverse order (Sunday → yadnuS)
		
		String day = "Sunday";
		
		for(int i=5; i>=0; i--) {
		System.out.print(day.charAt(i));
		}
	
		System.out.println();
		
		
		
		/*Create a String and if the String is not empty perform the following: 
		if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String
		*/
		
		String str= "Christmas";
		int len = str.length();
		
		
		if(!(str.isEmpty())) {
			if((len%2!=0) && len>=3) {
				System.out.println(str.charAt(len/2));
		    }
	
		}
		
		/*
		 * Write a program that reads two people’s first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: 
		 * Example Output: Mom’s first name? Mary. Dad’s first name? Daniel. Boy or Girl? boy. Suggested baby name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary. Dad’s first name? Daniel. Boy or Girl? girl. Suggested baby name: MAIEL
		 */
	
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter fathers name");
		String father=scan.nextLine();
		
		System.out.println("Enter mothers name");
		String mother=scan.nextLine();
		
		System.out.println("Are you expecting a girl or a boy?");
		String gender=scan.nextLine();

		if(gender.equalsIgnoreCase("boy")) {
		
			System.out.print("Your baby's name will be "+((father.substring(0,father.length()/2))+""+(mother.substring(mother.length()/2))).toUpperCase());
	
		}else if(gender.equalsIgnoreCase("girl"))	{
			System.out.print("Your baby's name will be "+((mother.substring(0,mother.length()/2))+""+(father.substring(father.length()/2))).toUpperCase());
		}else {
			System.out.println("Invalid input");
		}
		
	
	}
}
