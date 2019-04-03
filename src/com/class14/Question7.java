package com.class14;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		//Write a java program to check whether a given number is prime or not?3,5,7,11,13,17,19,23,29,31,37

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
	
        boolean notPrime = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                notPrime = true;
                break;
            }
        }

        if (!notPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
		
		
	}

}
