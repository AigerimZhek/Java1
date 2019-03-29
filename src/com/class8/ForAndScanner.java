package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {

		//prompt user to enter to integers and compare them.at the end print largest number
		
		Scanner scan;
		int num1, num2; 
		int largest=0;
		
		scan=new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			
		System.out.println("Please enter first number");
			num1 = scan.nextInt();
		System.out.println("Please enter second number");
			num2 = scan.nextInt();
		
			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println("Numbers are equal");
			}
		System.out.println(largest+" is the largest");
	   }
	}
}
