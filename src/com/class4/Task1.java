package com.class4;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		double rate;
		double expectedRate = 4.5;
		int price;
		int savings=200000;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your mortgage rate");
		rate=sc.nextDouble();
		
		if(rate>expectedRate) {
			System.out.println("Your mortgage rate is high enough");
			System.out.println("Enter the price of the house");
			price=sc.nextInt();
			
			if(price>savings) {
				System.out.println("You have to get a loan");
			}
			else {
				System.out.println("You have enough money. You don't need a loan");
			}
		}
		else {
			System.out.println("Your rate is too low. You're not eligible for buying the house");
		}
	
	}

}
