package com.class4;

public class PositiveNegative {

	public static void main(String[] args) {
		
		
		//write a prog to check whether the number is positive or negative
		
		int num=0;
		
		if(num>0) {
			System.out.println("Positive");
		}else if (num<0) {
			System.out.println("Negative");
		}else {
			System.out.println("It's 0");
		}
		
		//declare boolean variable isRaining, and if it's true --> stay home
		
		boolean isRaining=3>7; //(true or false)
		
		if(isRaining) {
			System.out.println("Stay home");
		}
		else {
			System.out.println("Take a walk");
		}

	}

}
