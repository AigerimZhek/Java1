package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		/*3. Print the following pattern:
		1
		12
		123
		1234
		12345
		*/

		Task3 a=new Task3();
		a.pattern();

	}
	void pattern () {
		for(int i=1; i<=5; i++) {
			for(int y=1; y<=i; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}