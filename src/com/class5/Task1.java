package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Double height;
		
		System.out.println("Enter 1st persons height");
		height=sc.nextDouble();
		
		if(height<5) {
			System.out.println("You are short");
		}else if(height>=5 && height<=6) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
		}
		
		System.out.println("Enter second persons height");
		height=sc.nextDouble();
		
		if(height<5) {
			System.out.println("You are short");
		}else if(height>=5 && height<6) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
		}

	}

}
