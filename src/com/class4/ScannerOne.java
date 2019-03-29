package com.class4;

import java.util.Scanner;

public class ScannerOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Good morning " + name);

		System.out.println("Where do you live?");
		String city = input.nextLine();

		System.out.println("All right");

		System.out.println("Enter your age");

		int age = input.nextInt();

		System.out.println("Thank you");

		System.out.println("Provide your phone number");
		
		long ph=input.nextLong();
		
	}
}
