package exercises;

import java.util.Scanner;

public class BreakTheNumber {

	public static void main(String[] args) {
		// Write a Java program to break an integer into a sequence of individual digits.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input six non-negative digits:");
		int num=scan.nextInt();
		
		/*
		int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
		 */
		
		int d6=num%10;
		int left=num/10;
		
		int d5=left%10;
		left=left/10;
		
		int d4=left%10;
		left=left/10;
		
		int d3=left%10;
		left=left/10;
		
		int d2=left%10;
		left=left/10;
		
		int d1=left%10;
		left=left/10;

		System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6);
	}

}
