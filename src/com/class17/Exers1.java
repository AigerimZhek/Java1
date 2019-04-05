package com.class17;

public class Exers1 {

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.

		Exers1 obj = new Exers1();
		obj.numbers(54, 74);
		obj.numbers(25, 12);
		obj.numbers(12, 12);
		
		obj.check(5);
		obj.check(18);
		
		obj.palindrome("kayak");
		obj.palindrome("street");
		
	}
	void numbers (int a, int b) {
		if(a>b) {
			System.out.println("A is larger");
		}else if(a<b) {
			System.out.println("B s larger");
		}else {
			System.out.println("Numbers are equal");
		}
	}
	void check (int a) {
		if(a%2==0) {
			System.out.println("A is an even number");
		}else {
			System.out.println("A is an odd number");
		}
	}
	void palindrome(String word) {
		String str = "";
		for(int i=word.length()-1; i>=0; i--) {
			str=str+word.charAt(i);
			}
		if(word.equals(str)) {
				System.out.println(word+" is a palindrome word");
			}else {
				System.out.println(word+" is not a palindrome word");
			}
		
	}

}
