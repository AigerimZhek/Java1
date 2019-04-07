package com.class19;

public class Minimum {
	
	
	static int minOfArrays(int[] x) {
		
		 int min=x[0];
		 
		for (int i=0; i<x.length; i++) {
			if(x[i]<min) {
				min=x[i];
			}
		}
		return min;
	}
	
	static int maxOfArrays(int[] x) {
		int max=x[0];
		
		for (int i=0; i<x.length; i++) {
		if(x[i]>max) {
			max=x[i];
		}
		}
		return max;
	}
	void print() {
		
	}

}
