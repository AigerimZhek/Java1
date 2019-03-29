package com.class10;

public class Task1 {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades= new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade[1]);
		
		//---------------------------------------------------------------------------------------------------------
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names= new String[4];
		
		names[0]="Fabi";
		names[1]="Anastasia";
		names[2]="Adrian";
		names[3]="Aigerim";
		
		System.out.println(names[3]);
		
		
		String[] name= {"Fabi", "Anastasia", "Adrian", "Aigerim"};
		
		System.out.println(name[3]);
		
		//-----------------------------------------------------------------------------------------------------------
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”.
		
		String[] task= new String[5];
		
		task[0]="Java";
		task[1]="Saturday";
		task[2]="coding";
		task[3]="day";
		task[4]="is";
		
		System.out.println(task[1]+" "+task[4]+" "+task[0]+" "+task[2]+" "+task[3]);
		
		String[] task1=  {"Java","Saturday","coding","day","is"};
		
		System.out.println(task1[1]+" "+task1[4]+" "+task1[0]+" "+task1[2]+" "+task1[3]);
		
		

	}

}
