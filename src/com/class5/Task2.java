package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter quiz score");
		int quiz=sc.nextInt();
		System.out.println("Enter mid term score");
		int midSc=sc.nextInt();
		System.out.println("Enter finals score");
		int finalSc=sc.nextInt();
		float avgScore=((quiz+midSc+finalSc)/3);
		System.out.println("Your average Score is "+avgScore);
		
		if(avgScore>=90) {
			System.out.println("Grade = A");
		}else if (avgScore>=70 && avgScore<90) {
			System.out.println("Grade = B");
		}else if (avgScore>=50 && avgScore<70) {
			System.out.println("Grade = C");
		}else {
			System.out.println("Grade = F");
		}
		


	}

}
