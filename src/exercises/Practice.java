package exercises;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// Write a Java program to get the difference between the largest and smallest values in an array of integers.
		//The length of the array must be 1 and above
		//Write a Java program to compute the average value of an array of integers except the largest and smallest values. 
		
		
		int[] array = new int[5];
		int min= array[0];
		int max= array[0];
		int sum = 0;
		int dif;
		int avg = 0;
	
		Scanner scan = new Scanner(System.in);
		
		
		 System.out.println("Enter 5 integers"); 
		 
		for(int i=0; i<array.length; i++) {
		
			 array[i] = scan.nextInt();
			min=array[i];
		}
		for(int arr:array) {
		
			if (arr > max) {
				max = arr;
			}
			if (arr < min) {
				min = arr;
			}	
		
			sum=sum+arr;
			
		}
		avg = (sum-max-min)/(array.length-2);
		dif = max-min;
		System.out.println(max);
		System.out.println(min);
		System.out.println(dif);
		System.out.println(sum);
		System.out.println(avg);
	}

}
