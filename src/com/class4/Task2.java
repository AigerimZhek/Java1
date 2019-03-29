package com.class4;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int years;
		double salary;
		
		
		Scanner job=new Scanner(System.in);
		
		System.out.println("Enter the number of worked years");
		
		years=job.nextInt();
		
		
		if(years>=5) {
			System.out.println("You're eligigle for the bonus");
			System.out.println("Enter your annual salary");
			
			salary=job.nextDouble();
			
			if(salary>50000) {
				System.out.println("Your bonus is 5000$");
			}else {
				System.out.println("Your bonus is 3000$");
			}
			
		}else {
			System.out.println("You're not eligible for the bonus");
		}
	}

}
