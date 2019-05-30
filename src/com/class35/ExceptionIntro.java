package com.class35;

public class ExceptionIntro {

	public static void main(String[] args) {

		  int a=10; 
		  int b=0;
		  		  
		  System.out.println(a/b);
		  
		  System.out.println("Code after an exception");//won't be executed
		 		 
		
		ArithmeticException except=new ArithmeticException();
		throw except;
	}

}
