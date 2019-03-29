package com.class8;

public class ContinueFor {

	public static void main(String[] args) {

		for(int i=0; i<7; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(" ");

		
		for(int i=0; i<10; i++) {
			if(i==2 || i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(" ");

		
		//i want to print numbers 1-20 but skip those that divisible by 3
		
		for (int i=1; i<=20; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(" ");

	}

}
