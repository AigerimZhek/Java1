package com.class7;

public class EvenNumbers {
	
	public static void main(String[] args) {
		//print only even numbers from 10 to 100
		
		int num=10;
		while (num<=100) {
			if(num%2==0) {
				System.out.print(num+" ");
			} 
			num++;
		}	
	}
}
