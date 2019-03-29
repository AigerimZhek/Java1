package com.class6;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String grade;
		String expl;
		
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		
		switch (grade) {
		
		case "A":
			expl="Excellent";
			break;
		case "B":
			expl="Good";
			break;
		case "C":
			expl="Average";
			break;
		case "D":
			expl="Bad";
			break;
		default:
			expl="Not Acceptable";
		}
		System.out.println("Your grade is "+expl);
		
	}

}
