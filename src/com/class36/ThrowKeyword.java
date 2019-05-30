package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		//System.out.println(a/b);// new ArithmeticException
		
		//if person is 18yo --> issue dr license -->throw an exception
	//	checkAgeEligibility(17);
		
		//twoNumDivision(10, 0);
		
		checkUserNameLength("a");

	}
	
	public static void checkAgeEligibility(int age) {
		if(age>=18) {
			System.out.println("Congratulations on your driver license");
		}else {
			throw new ArithmeticException("You are not eligible to get driver license");
		}
	}
	
	public static void twoNumDivision(int a, int b) {
		
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot divide by zero");
		}
	}
	
	public static void checkUserNameLength(String userName) {
		if (userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("Username must be longer than 3 characters");
		}
	
	}
}
