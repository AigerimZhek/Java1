package exercises;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
		//Write a Java program to takes the user for a distance (in meters) 
		//and the time was taken (as three numbers: hours, minutes, seconds), 
		//and display the speed, in meters per second, kilometers per hour and miles per hour 
		//(hint: 1 mile = 1609 meters)
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input distance in meters:");
		float meters=scan.nextFloat();
		System.out.println("input time: hours:");
		int hour=scan.nextInt();
		System.out.println("minutes:");
		int minute=scan.nextInt();
		System.out.println("seconds:");
		int second=scan.nextInt();
		
		int hourInSec=hour*3600;
		int minInSec=minute*60;
		
		float timeInSec=hourInSec+minInSec+second;
		float meterPerSec=meters/timeInSec;
		
		
		float kmPerHour=(meters/1000.0f)/(timeInSec/3600.0f);
		
		float miPerHour=(meters/1609.0f)/(timeInSec/3600.0f);
		
		System.out.println("Your speed in meters/second is "+meterPerSec);
		System.out.println("Your speed in km/h is "+kmPerHour);
		System.out.println("Your speed in miles/h is "+miPerHour);
		
	}

}
