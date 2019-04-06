package com.class17_2;

import java.util.Scanner;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {


		ScannerMethod scn = new ScannerMethod();// can access a different class in the same package
		//System.out.println(scn.sum(5, 8));
		
		
		
		Calculator obj = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("choose the operation: +,-,*,/");
		
		String f=scan.nextLine();
		String c=scan.nextLine();
		
		   if(c.equals("+")) { 
			   System.out.println(obj.sum(a, b)); 
		  }else if(c.equals("-")) { 
			  System.out.println(obj.sub(a, b)); 
		  }else if(c.equals("/")) { 
			  System.out.println(obj.div(a, b)); 
		  }else if(c.equals("*")) {
			  System.out.println(obj.mult(a, b)); 
		  }
		 

	}

}
