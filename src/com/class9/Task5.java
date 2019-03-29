package com.class9;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * 5.
		 * Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small.
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int y=5;
		int k;
		
		System.out.println("Please enter the number between 1-20");
		k=scan.nextInt();
		for(int i=0; i<25; i++) {
		
		if(k>y) {
			System.out.println("The number is too big. Try again");
			k=scan.nextInt();
		}else if(k<y) {
			System.out.println("The number is too small. Try again");
			k=scan.nextInt();
		}else {
			System.out.println("Congratulations! You got it!");
			break;
		}

	}

}
}
