package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

/* Ask user to enter age and based on the age we will print:
 * if age is >1 but <3 --> baby
 * if age is >3 but <5 -->toddler
 * if age is >5 but <13 --> kid
 * if age is >13 but <20 --> teenager
 * if age is >20 but <64 --> adult
 * if age is >=64 -->senior
 */
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=sc.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println("You are a baby");
		}else if(age>=3 && age<5) {
			System.out.println("You are a toddler");
		}else if(age>=5 && age<13) {
			System.out.println("You are a kid");
		}else if(age>=13 && age<20) {
			System.out.println("You are a teenager");
		}else if(age>=20 && age<64) {
			System.out.println("You are a adult");
		}else {
			System.out.println("You are a senior");
		}
		
	}

}
