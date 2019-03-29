package exercises;

import java.util.Scanner;

public class TwoInt {

	public static void main(String[] args) {
		// Write a Java program that accepts two integers from the user and then 
		//prints the sum, the subtraction, the multiplication, division, the average,  
		//the maximum (the larger of the two integers), the minimum (smaller of the two integers).
		
		Scanner scan=new Scanner(System.in);
		
		float div,average,a,b,sum,sub,mult,max,min;
		
		System.out.println("Input two integers:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		sum=a+b;
		sub=a-b;
		
		if(a>b) {	
			max=a;
			min=b;
		}else {
			max=b;
			min=a;
		}
		
		mult=a*b;
		
		div=(a/b);
		
		average=(a+b)/2f;
		
		System.out.println("The sum of "+a+" and "+b+" is "+sum+". The subtraction is "+sub+". The multiplication is "+mult+". The division is "+div+". The average is "+average+". The larger number is "+max+", the smaller is "+min);
		
		

	}

}
