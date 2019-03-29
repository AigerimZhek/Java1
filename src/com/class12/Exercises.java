package com.class12;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * 1 Username and Password cannot be empty, if so→ message=”Username and Password cannot be empty”. 
		 * 2 Password should be minimum 8 characters, if less → message=”Password is too short”. 
		 * 3 Password cannot contain username if so, → * message=”Password cannot contain username”. 
		 * 4 Password should match confirmed * password, if not → message “Passwords do not match”. 
		 * Only after all requirements met → message “Your username and password has been created”
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username and password:");
		String name=scan.nextLine();
		String password=scan.nextLine();
		System.out.println("Please confirm the password");
		String password1=scan.nextLine();
		
		boolean isEmpty=name.isEmpty();
		boolean isEmpt=password.isEmpty();
		int length=password.length();
		boolean contain=password.contains(name);
		boolean confirm=!(password.equals(password1));
		
		if(isEmpty || isEmpt) {
			System.out.println("Username and password cannot be empty");
			
		}else if (length<8){
			
				System.out.println("Password is too short");
			
		}else if(contain) {
					System.out.println("Password cannot contain username");
				
		}else if(confirm) {
						System.out.println("Passwords do not match!");
		}else  {
						System.out.println("Your username and password have been created");
					
			}
		}
	}
