package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		System.out.println("Beginning of the code");
		
		int a=10;
		int b=0;
		
		try {
		System.out.println(a/b);
		System.out.println("Code inside the try block");
		}catch(ArithmeticException e) {
			System.out.println("Code inside the catch block");
		}
		System.out.println("The end of the program");
	}

}
