package com.class6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1;
		int num2;
		char operation;
		int solution;
		
		System.out.println("input first number");
		num1=scan.nextInt();
		System.out.println("input operator");
		operation=scan.next().charAt(0);
		System.out.println("input second number");
		num2=scan.nextInt();
		
		switch (operation) {
		
		case '+':
			solution=num1+num2;
			break;
		case '-':
			solution=num1-num2;
			break;
		case '*':
			solution=num1*num2;
			break;
		case '/':
			solution=num1/num2;
			break;
		default:
			solution=0;
		}
		System.out.println(solution);
		

	}

}
