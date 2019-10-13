package com.class14;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?

		int[] a = { 10, 2, 18, 3, 31, 85, 4, -1, 1, 16,5, 14, 6, 9, 15, 22, 7, 8 };

		int max = 0;
		int min = 2;
		int second = 0;
		int third = 0;
		int secondMin=0;
		
//		Arrays.sort(a);
//		int b = a[a.length-1];
//		System.out.println(b);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				second=max;
				max = a[i];
			} else if (a[i] < min) {
				secondMin=min;
				min = a[i];
			} else if (a[i]>second) {
				third=second;
				second=a[i];
			}else if(a[i]>third) {
				third=a[i];
			}else if(a[i]<secondMin) {
				secondMin=a[i];
			}
		}

		System.out.println("Max " + max);
		System.out.println("Min " + min);
		System.out.println("Second largest "+second);
		System.out.println("Third largest "+third);
		System.out.println(secondMin);
		
	/*	for(int num:a) {
			if(num>max) {
				max=num;
			}
		}
		for(int num:a) {
			if(num>second && num<max) {
				second=num;
			}
		}
		System.out.println(max);
		System.out.println(second);*/
		
		
		
	}

}
