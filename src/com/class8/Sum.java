package com.class8;

public class Sum {

	public static void main(String[] args) {

		int sumo=0;
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);//15
		
		
		
		//find sum of all even numbers 1-100
		
		for(int i=2; i<=100; i+=2) {
			sumo=sumo+i;
		}
		System.out.println(sumo);
		
	}

}
