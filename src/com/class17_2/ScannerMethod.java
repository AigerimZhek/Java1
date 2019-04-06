package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj = new ScannerMethod();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+" "+b);
		System.out.println(obj.sum(a, b));
		
		
		//obj.sum(5, 8);
		

	}
	public int sum(int x, int y) {
	//	System.out.println("Sum is ");
		return x+y+100;
	}

}
