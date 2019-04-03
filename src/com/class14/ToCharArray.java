package com.class14;

public class ToCharArray {

	public static void main(String[] args) {
		// --------------------------toCharArray - converts string to array of characters------------------------
		
		String str="saturday";

		char[] array=str.toCharArray();
		
		System.out.println("----------------------Using for loop-----------------------");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("----------------------Using for each loop--------------------------");
		for(char c:array) {
			System.out.println(c);
		}
		
		System.out.println("---------------------Printing in reverse--------------------");
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
