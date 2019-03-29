package com.class7;

public class DoWhile {

	public static void main(String[] args) {
		//DO WHILE - executes first and then checks condition
		
		int a=10;
		do {
			System.out.println("Hello");
			a++;
		}
		while (a>15);
		
		
		int c=5;
		do {
			System.out.println("Yes");
			c++;
		}while(c<10);
		
		//-----------------------------------------------------------------------------------------------------
		//WHILE - checks condition and the executes
		
		int b=10;
		while(b>15) {
			System.out.println("Bye");
			b++;
		}
		
		int e=7;
		while(e<10) {
			System.out.println("No");
			e++;
		}

	}

}
