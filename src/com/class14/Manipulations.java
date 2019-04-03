package com.class14;

public class Manipulations {

	public static void main(String[] args) {
		
		//1----------------------------------------------replace--------------------------------------------------------------------------
		
		String str="I am a good tester!";
		
		String newstr=str.replace("a", "e");
		System.out.println(newstr);
		
		String newstr1=str.replace("good", "great");
		System.out.println(newstr1);
		
		String newstr2=str.replace("tester", "programmer");
		System.out.println(newstr2);
		
		String newstr3=str.replace("Tester", "programmer");
		System.out.println(newstr3);// no change
		
		str=str.replace("!", ".");
		System.out.println(str);//reassign
		str=str.replace("o", "u");
		System.out.println(str);
		
		//2----------------------------replaceAll() - will replace all that matches specified pattern[regex]----------------------------------
		
		String str1="12Hello 3234 World 465%^%";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");//only numbers
		System.out.println(replacedNoNumbers);
		
		String replaced1=replacedNoNumbers.replaceAll("[^A-Za-z]", "");//everything, but letters; ^==!
		System.out.println(replaced1);
		
		String replacedNoCharacters=replacedNoNumbers.replaceAll("[A-Z a-z]", "");//only letters
		System.out.println(replacedNoCharacters);
		
		
		String str2= "1Hello123";
		System.out.println(str2.replaceAll("[^0-9]",""));
		
		
	}

}
