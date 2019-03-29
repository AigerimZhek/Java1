package exercises;

import java.util.Scanner;

public class AverageOfNum {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements
		
				Scanner scan=new Scanner(System.in);
				int[] num= new int [5];
				double avg;
				double sum=0;
				
				System.out.println("enter 5 integers");
				
				for(int i=0; i<num.length; i++) 
					num[i]=scan.nextInt();
				    for(int i:num) {
						
						sum+=i;
						
						}
					avg=sum/num.length;
					System.out.println(avg);

	}

}
