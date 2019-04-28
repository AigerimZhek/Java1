package com.class30;

public abstract class Marks {
	
	int a,b,c,d;
	/*
	 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
	 * and in four subjects (each out of 100) by student B. 
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	 * It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
	 * The constructor of student A takes the marks in three subjects as its parameters 
	 * and the marks in four subjects as its parameters for student B. Test your code
	 */
	
	public abstract void getPercentage();
}

class A extends Marks{
	
	A(int a, int b, int c){
		super.a=a;	
		super.b=b;
		super.c=c;	
	}

	@Override
	public void getPercentage() {
		double percent=(a+b+c)/3;
		System.out.println(percent);
		
	}
	
}

class B extends Marks{

	public B(int a, int b, int c, int d) {
		super.a=a;	
		super.b=b;
		super.c=c;
		super.d=d;
	}
	@Override
	public void getPercentage() {
		double percent=(a+b+c+d)/4;
		System.out.println(percent);
		
	}
	
}

