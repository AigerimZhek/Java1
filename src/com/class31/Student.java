package com.class31;

import java.util.ArrayList;

public class Student {
	
	public String name;
	public int studentId;
	
	public Student (String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void printDetails() {
		System.out.println(name+" "+studentId);
	}

}
