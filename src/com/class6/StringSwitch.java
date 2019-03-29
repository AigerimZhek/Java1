package com.class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter what country you are from");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			food="Burger";
			break;
		case "Afghanistan":
			food="Palau";
			break;
		case "Russia":
			food="Pelmeni";
			break;
		case "Italy":
			food="Pasta";
			break;
		case "Turkey":
			food="Baklava";
			break;
		case "Morocco":
			food="Couscous";
			break;
		case "Kazakhstan":
			food="Beshparmak";
			break;
		case "Pakistan":
			food="Biryani";
			break;
		default:
			food="unknown";
		}
		System.out.println("Your favorite food is "+food);
	}

}
