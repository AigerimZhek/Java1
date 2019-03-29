package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Ask user to enter the item they want to buy and  the price for the item. 
		//Then ask user to pay for it. 
		//Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
		//Whenever user done with payments tell them "Thank you for shopping!"
		
		Scanner scan=new Scanner(System.in);
		String item;
		int price;
		int payment;
		int sum=0;
		int left=0;
		
		
		System.out.println("Enter the item you want to buy");
		item=scan.nextLine();
		System.out.println("Enter the price");
		price=scan.nextInt();
		
		do {
			
		System.out.println("Pay for your purchase");
		payment=scan.nextInt();
		sum=sum+payment;
		left=price-sum;
		System.out.println("You owe "+left+"$ more");
		}
		while(sum<price);
		if(sum>price) {
			System.out.println("Your change is "+(sum-price)+"$. Thank you for shopping!");
		} else {
			System.out.println("Thank you for shopping!");
		}
		
	}

}
