package com.class8;

public class Time {

	public static void main(String[] args) {
		
		for(int min=00; min<31; min++) {
			if(min<10) {
				System.out.println("the time is 07:0"+min);
			}else {
			System.out.println("the time is 07:"+min);
			}
		}
		

		int min=00;
		
		while(min<=30) {
			if(min<10) {
				System.out.println("the time is 07:0"+min);
			}else {
			System.out.println("the time is 07:"+min);
			}
			min++;
		}
		
		
		int minute=00;
		do {
			if(minute<10) {
				System.out.println("The time is 07:0"+minute);
			}else {
			System.out.println("The time is 07:"+minute);
			}
			minute++;
		}while(minute<31);

	}

}
