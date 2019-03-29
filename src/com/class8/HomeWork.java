package com.class8;

import java.util.Scanner;

public class HomeWork {
	
	/*
	 * ask user to pay for soda, keep asking user to pay for soda until entered price is not equal to 1.99. 
	 * after user got a right amount print"Please enjoy your soda"
	 */

	public static void main(String[] args) {
		
		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
		} while (price!=1.99); {
			System.out.println("Please enjoy your soda");
		}	

	}

}
