package exercises;

import java.util.Scanner;

public class InchToMeter {
	public static void main(String[] args) {
		//Write a Java program that reads a number in inches, converts it to meters. One inch is 0.0254 meter.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length in inches:");
		double inch=scan.nextInt();
		
		double meter=inch*0.0254;
		System.out.println(inch+" in inches equals to "+meter+" in meters");
		
	}

}
