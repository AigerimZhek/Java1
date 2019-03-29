package com.class6;

import java.util.Scanner;

public class CountryLangauge {

	public static void main(String[] args) {

		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Kazakhstan":
			language="kazakh";
			break;
		case "Russia":
			language="russian";
			break;
		case "Iran":
			language="farsi";
			break;
		case "Korea":
			language="korean";
			break;
		case "England":
			language="english";
			break;
		case "France":
			language="french";
			break;
		default:
			language="Unknown";
		}
		
		System.out.println("You speak "+language);
		
	}

}
