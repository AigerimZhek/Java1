package com.class7;

import java.util.Scanner;

public class IncremDecrement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a; // preincrement = first increment then assign
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
		
		int c=10;
		int d=c++; // postincrement = first assign then increment
		System.out.println("Value of d is "+d);
		System.out.println("Value of c is "+c);
		
		
		int q=100;
		int e=q--; 
		 // postdecrement = first assign then decrement
		System.out.println("Value of e is "+e); 
		System.out.println("Value of q is "+q);
		
		int h=50;
		int g=--h;
		System.out.println("Value of g is "+g);
		System.out.println("Value of h is "+h);
		
		System.out.println("Enter integer");
		int y=scan.nextInt();
		y++;
		System.out.println(y);
		

	}

}
