package com.class24;

public class Task3 {

	public static void main(String[] args) {
		//  Create 1 class with a private method that has 3 overloaded forms.
		//Then call each overloaded method with specific arguments and observe result.
		
		Task3 obj = new Task3();
		
		obj.work(2.2);
		obj.work(88);
		obj.work("Google");

	}
	
	private void work(String str) { 
		System.out.println("I work at "+str);
	}
	private void work(int num ) {
		System.out.println("My company has "+num+" locations");
	}
	private void work (double dob) {
		System.out.println("I like testing");
	}

}
