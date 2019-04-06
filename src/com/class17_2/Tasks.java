package com.class17_2;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		//. Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		
	Tasks obj = new Tasks();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter start and end point");
	int x = scan.nextInt();
	int y = scan.nextInt();
	obj.value(x, y);
	
	//obj.value(5, 54);
	
	
	}
	void value (int a, int b) {
		
		int sumE=0;
		int sumO=0;
		
	
		
		if(b>a) {
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				sumE=sumE+i;
				
			}else {
				sumO=sumO+i;
			}
		}
		System.out.println("Sum of even numbers "+sumE);
		System.out.println("Sum of odd numbers "+sumO);
		
		
		}
	}

}
