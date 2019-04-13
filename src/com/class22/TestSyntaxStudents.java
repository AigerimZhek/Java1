package com.class22;

public class TestSyntaxStudents {

	public static void main(String[] args) {

		/*
		 * SyntaxStudent student1 = new SyntaxStudent(); 
		 * student1.studentName = "Samir";
		 * student1.studentLastName="Aziz"; 
		 * student1.getStudentDetails();
		 */
		
		SyntaxStudent student1 = new SyntaxStudent("Samir","Aziz");
		student1.getStudentDetails();
		
		SyntaxStudent student2 = new SyntaxStudent("Asha","Noman");
		student2.getStudentDetails();
		
		SyntaxStudent student3 = new SyntaxStudent("Mohammad","Ali");
		student3.getStudentDetails();
		
		SyntaxStudent student4 = new SyntaxStudent("Mustafa","Ozturk");
		student4.getStudentDetails();
	}

}
