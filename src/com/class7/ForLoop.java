package com.class7;

public class ForLoop {

	public static void main(String[] args) {
		
		
		//initialize condition/testCondition increment/decrement
		for (int i=1; i<=10; i++) {
			System.out.print("Good morning "+i+" ");
		}
		
		System.out.println(" ");

		//I want to print numbers 10-1
		
		for (int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println(" ");

		
		for (int a=0; a<=20; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println(" ");

		
		for(int b=1; b<=50; b+=5) {
			System.out.print(b+" ");
		}
		
		
		System.out.println(" ");

		for(int b=5; b<=5; b++) {
			System.out.println(b);

		}
		
		for (int b=1; b!=5; b++) {
			System.out.println(b);

		}
	}

}
