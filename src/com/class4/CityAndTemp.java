package com.class4;

import java.util.Scanner;

public class CityAndTemp {
	public static void main(String[] args) {
		
		/*
		* Ask user to enter city and temperature in Fahrenheit
		* Your program should convert F-->C
		* Your program should say “The temperature in the city ___is ___”
		*/
		
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		cityName=myScanner.next();
		System.out.println("Please enter your temperature in F");
		temp=myScanner.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temperature in the city "+cityName+" is "+convertedTemp+" C");
		
	}

}
