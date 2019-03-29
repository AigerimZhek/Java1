package com.class11;

public class Tasks {

	public static void main(String[] args) {
		/* Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		After storing values print the following:
			Mrs Smith, Mr Obama, Ms Jackson.*/

		
		String[][] names= {{"Mr", "Mrs","Ms","Miss"}, {"Smith","Jordan","Jackson","Obama"}};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		
		
		/*Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has as an A and B grade
		 */
		
		String[][] nameGrade= {{"Aigerim","Lyazzat","Andrei","Serik"}, {"A","B","C","D"}};
		
		System.out.println(nameGrade[0][0]+" has grade "+nameGrade[1][0]);
		System.out.println(nameGrade[0][1]+" has grade "+nameGrade[1][1] );
	
	
	
	}

}
