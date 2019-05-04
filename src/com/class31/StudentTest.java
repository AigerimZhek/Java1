package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

class StudentTest{
	public static void main(String[] args) {
		
		Student s1 = new Student("John", 101);
		Student s2 = new Student("James",102);
		Student s3 = new Student("Anna", 103);
		Student s4 = new Student("Katy", 104);
		
		ArrayList<Student> alist = new ArrayList<Student>();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		
		for(Student student:alist) {
			student.printDetails();
			System.out.println(student.name);
			System.out.println(student.studentId);
		}
		
		Iterator<Student> it = alist.iterator();
		while (it.hasNext()) {
			Student obj = it.next();
			obj.printDetails();
		}
	}
}

