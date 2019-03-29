package exercises;

import java.util.Scanner;

public class MinutesConverter {

	public static void main(String[] args) {

		//Write a Java program to convert minutes into a number of years and days
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of minutes");
		long input=scan.nextInt();
		
		long day=24*60;
		long year=365*24*60;
		
		long convY=input/year;
		long convD=((input/day)%365);
		System.out.println(input+" minutes is approximately "+convY+" years and "+convD+" days");
	
	}

}
