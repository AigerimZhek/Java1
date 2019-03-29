package com.class4;

import java.util.Scanner;

public class DMV {
	public static void main(String[] args) {
		int age;
		Scanner dmv=new Scanner(System.in);
		
		System.out.println("What is your age?");
		age=dmv.nextInt();
		
		if(age>=18) {
			System.out.println("Your drivers licence will be issued to you");
		}
		else {
			System.out.println("I offer you to get a learners permit");
		}
		System.out.println("Good luck!");
		
	}

}
