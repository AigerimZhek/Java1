package com.class20;

public class Task {

	public static void main(String[] args) {

		/* Create a method createEmail().
        * Based on provided users name, lastName and email type,
        * your method should return complete email Address;
        * johnsnow@gmail.com
        * johnsnow@yahoo.com*/
		
		//1-------------------------------------------------------------------------
		Task obj = new Task();
		String a = obj.createEmail("Aigerim", "Zhekibayeva", "@gmail.com");
		System.out.println(a);
		
		//2---------------------------------------------------------------------------------
		System.out.println(obj.getGrade(55));
		System.out.println(obj.getGrade(89));
		System.out.println(obj.getGrade(95));

	}
	
//1-----------------------------------------------------------------------
	String createEmail(String name, String lastName, String emailType) {
		String a = name+lastName+emailType;
		return a.toLowerCase();
	}
	
//2-----------------------------------------------------------------------
	char getGrade(int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=50) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
	}
	
}
