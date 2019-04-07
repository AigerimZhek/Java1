package com.class19;

public class Calculator {
	
	
	static int sum (int a, int b, int c) {
		return a+b+c;
	}
	
	static int avg (int a, int b, int c) {
		return (a+b+c)/3;
	}
	static int min (int a, int b, int c) {
		int min=a;
		if(b<a && b<c) {
			min=b;
		}else if(c<a && c<b) {
			min=c;
		}
		
		return min;
	}
	static int max(int a, int b, int c) {
		int max=a;
		if(b>a && b>c) {
			max=b;
		}else if(c>a && c>b) {
			max=c;
		}
		return max;
	}
	

}
