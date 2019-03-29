package com.class12;

import java.util.Scanner;

public class HOmeW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		   
		   if(browser.equalsIgnoreCase("ChRoME")) {
		     System.out.println("Proceed with chrome Browser");
		   }else if(browser.equalsIgnoreCase("Firefox")){
			   System.out.println("");
		   }else {
			   System.out.println("Invalid Browser");
		   }

	}

}
