package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/* let user define a range of numbers to print */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please define a starting number");
		int start = scan.nextInt();
		System.out.println("Please enter ending number");
		int end = scan.nextInt();
		
		if(start<end) {

		for (int i = start; i <= end; i++) {

			System.out.println(i);
		}

		}else {
			System.out.println("I won't run your code");
		}
	}

}
