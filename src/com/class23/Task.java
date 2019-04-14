package com.class23;

public class Task {
	
	public void area(int a, int b) {//overload only works with void
		System.out.println("The area of a rectangle with parameters "+a+" and " +b+" is equal to "+(a*b));
	}
	
	public void area(int a) {
		System.out.println("The area of a square with parameters "+a+" is equal to "+(a*a));
	}
	
	public void area (int a,int b,int c) {
		System.out.println("The volume of a cube with parameters "+a+","+b+" and "+c+" is equal to "+(a*b*c));
	}

}
