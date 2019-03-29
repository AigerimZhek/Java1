package com.class9;

import java.util.Scanner;

public class Task5Dowhile {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int y=5;
		int k;
		
		System.out.println("Please enter the number between 1-20");
		
		do {
		
		k=scan.nextInt();
		
		if(y>k) {
			System.out.println("Number is too small");
		}else if(y<k) {
			System.out.println("Number is too large");
		}
		}while(y!=k);
		
		System.out.println("You got it!");

	}
}
