package com.class11;

public class Recap {

	public static void main(String[] args) {
		// create an array of names and retrieve all names from it;
		
		String[] names = new String[5];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		//names[5]="Shiva"; will get a runtime exception when trying to access it;
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//create an array using "array literal";
		
		String [] studentNames= { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		
		for(int i=0; i<=2; i++) {
			System.out.println(studentNames[i]);
			
			//retrieve values using: advanced for loop/ for each loop/ enhanced loop; ---> can only be used w/arrays or collections;
			
			for(String student : studentNames) {
				System.out.println(student);
			}
		}
		
	}

}
