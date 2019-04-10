package com.class20;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj = new Task2();
		
		String a = obj.reverse("lily");
		System.out.println(a);
		
		
		obj.palindrome("level");
		obj.palindrome("street");
		
		obj.returnArray("today is tuesday");

	}
	String reverse(String word) {
		//Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
		String reversed="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reversed=reversed+word.charAt(i);
		}
		return reversed;
	}
	//Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
	public void palindrome (String word) {
		String reversed=reverse(word);
		
			if (word.equals(reversed)) {
				System.out.println(word+" is a palindrome word");
			}else {
				System.out.println(word+" is not a palindrome word");
			}
		
	
	}
	//Create a method that will take a string and return array of words from that string. Method should be available only within same class.
	private void returnArray (String sentence) {
		String [] array = sentence.split(" ");
		for (String words:array) {
			System.out.println(words);
		}
		
	}

}
