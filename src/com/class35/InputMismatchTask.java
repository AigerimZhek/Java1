package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchTask {

	public static void main(String[] args) {
		// How would handle InputMismatchException? 
		//Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int a;
		
		try {
			 a= scan.nextInt();
			System.out.println("Great!");
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Input Mismatch. Try again");
		}
		
		
		

	}

}
