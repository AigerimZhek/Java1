package com.class8;

public class Task {

	public static void main(String[] args) {

		//1. print numbers 1-100
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");

		}
		System.out.println(" ");

		
		
		//2. print numbers 100-1
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println(" ");

		
		
		//3. print odd numbers 1-20 (2 ways)
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println(" ");

		for (int i=1; i<=20; i+=2) {
			System.out.print(i+" ");

		}
		System.out.println(" ");

		
		
		//4. print even numbers 20-1 (2 ways)
		
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");

		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");

		}
		System.out.println(" ");
		
		

		//5. print even numbers between 20-50 (2 ways)
		
		for(int i=20; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(" ");

		for(int i=20; i<=50; i+=2) {
			System.out.print(i+" ");

		}
		System.out.println(" ");
		
		

		//6. print odd numbers 20-50(2 ways)
		
		for(int i=20; i<=50; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");

			}
		}
		System.out.println(" ");
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i+" ");

		}

	}

}
