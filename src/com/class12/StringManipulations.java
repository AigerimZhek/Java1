package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		//Length function/method returns number of characters
		
		String str="Syntax";
		int lengthOfStrings=str.length();
		System.out.println(lengthOfStrings);//6
		
		String str1="Syntax Technologies";
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);//19
		
		String str2="Welcome, students";
		System.out.println(str2.length());//17
		
		String str3="Hello";
		//toUpperCase ---> converts all characters to Upper case;
		String newString=str3.toUpperCase();
        System.out.println(newString);
        //toLowerCase ---> converts all characters to Lower case
        String lowerCase=newString.toLowerCase();
        System.out.println(lowerCase);
        
        //equals() - compares 2 strings, if strings are equal --> true, else --->false;
        String str4="Hello";
        String str5="hello";
        
        boolean equality=str4.contentEquals(str5);
        System.out.println(equality);//false
        
        //equalsIgnoreCase() - compares 2 strings but ignores casing;
        String expectedBrowser="CHROME";
        String actualBrowser="chrome";
        boolean equals= expectedBrowser.equalsIgnoreCase(actualBrowser);
        System.out.println(equals);//true
        
		
	}

}
