package com.class17_2;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * 4. Print the following pattern:
*
**
***
****
*****
****
***
**
*
		 */
		
		Task4 a=new Task4();
		a.pattern();
		
		
	}
	void pattern() {
		for(int i=1; i<=5; i++) {
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4;i++) {
			for (int a=4;a>=i; a--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
