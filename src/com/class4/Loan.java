package com.class4;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		
		long sum;
		
		Scanner part=new Scanner(System.in);
		
		System.out.println("How much money do you need?");
		
		sum=part.nextLong();
		
		if(sum<=200000) {
			System.out.println("I will loan the money");
		}else {
			System.out.println("I will not loan you money");
		}
		
	}

}
