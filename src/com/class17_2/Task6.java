package com.class17_2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year. 
		 * As soon as the user enters the correct leap year exit the loop.
		 */
		
		Task6 leap = new Task6();
		leap.loop();
	
	}
	void loop () {
		Scanner scan=new Scanner(System.in);
		int guess;
		
		System.out.println("Please enter the leap year");
		guess=scan.nextInt();
		for(int i=1; i<10; i++) {
			if(guess%4!=0 || (guess%100==0 && guess%400!=0)) {
				System.out.println("Try again");
				guess=scan.nextInt();
			}else {
				System.out.println("You got it!");
				break;
			}
		}

	}

}
