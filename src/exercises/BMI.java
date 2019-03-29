package exercises;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		//Write a Java program to compute body mass index (BMI)
		
		
		Scanner scan=new Scanner(System.in);
		String category;
		
		System.out.println("Enter your height in inches:");
		float height=scan.nextFloat();
		System.out.println("Enter your weight in lbs:");
		float weight=scan.nextFloat();
		
		float bmi=703*weight/(height*height);
		
		if(bmi<18.5) {
			category="Underweight";
		}else if(bmi>=18.5 && bmi<=25) {
			category="Normal";
		}else {
			category="Overweight";
		}
		
		
		System.out.println("Your BMI is "+bmi+". You are in "+category+" category");
		

	}

}
