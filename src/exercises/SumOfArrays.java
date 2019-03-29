package exercises;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array
		
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		int[] arr= new int[5];
		
		System.out.println("Enter 5 integers:");
		for(int i=0; i<arr.length; i++) {
		arr[i]=scan.nextInt();
		}
		
		for(int i:arr) {
			sum=sum+i;
			
		}

		System.out.println("The sum of the integers is "+sum);
	}

}
