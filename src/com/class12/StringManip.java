package com.class12;

public class StringManip {

	public static void main(String[] args) {


		String str="Students";
		
		char character=str.charAt(7);
		System.out.println(character);
		
	
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
			
			if(i==6) {
				break;
			}
		}
		System.out.println();
		System.out.println("-----------------------Index of---------------------------");
		
		String str1="Sunday";
		int index=str1.indexOf("n");
		System.out.println(index);
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0
		System.out.println(str2.indexOf("Tech"));//7
		System.out.println(str2.indexOf("tax"));//3
		System.out.println(str2.indexOf(" "));//6
		System.out.println(str2.indexOf("w"));//-1
		
		System.out.println("------------------substring------------------------");
		//gives another string from your current string
		String str3 = "Today is Sunday Java Class";
		
		String newString=str3.substring(2);
		System.out.println(newString);
		
		System.out.println(str3.substring(0, 5));//Today
		System.out.println(str3.substring(9, 20));//Sunday Java
		System.out.println(str3.substring(21));//Class
	}

}
