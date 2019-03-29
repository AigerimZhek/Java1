package exercises;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an integer 0-1000");
		int num=scan.nextInt();
		
		int firstDigit=num%10;
		int remainder=num/10;
		int secondDigit = remainder%10;
		remainder = remainder/10;
		int thirdDigit= remainder%10;
		remainder=remainder/10;
		int fourthDigit=remainder%10;
		
		int sum=firstDigit+secondDigit+thirdDigit+fourthDigit;
		
		System.out.println("The sum of the digits of "+num+" is "+sum);


	}

}
