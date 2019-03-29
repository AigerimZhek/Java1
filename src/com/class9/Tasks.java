package com.class9;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		//. Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		
		Scanner scan=new Scanner(System.in);
		int sumE=0;
		int sumO=0;
		
		System.out.println("Please enter start and end points");
		int a=scan.nextInt();
		int b=scan.nextInt();	
		
		if(b>a) {
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				sumE=sumE+i;
				
			}else {
				sumO=sumO+i;
			}
		}
		System.out.println(sumE);
		System.out.println(sumO);
		
		
		}
	

	}

}
