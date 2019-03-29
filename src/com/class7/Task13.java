package com.class7;

public class Task13 {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true
		 * create int variable day and assgn it to 1
		 * as long as its workday print--> i need a day off and increment day
		 * once your day=6 -->change condition to i dont need a day off anymore
		 */
		
		boolean workDay=true;
		int day=1;
	
			while(workDay) {
					
				if (day==6) {
					System.out.println("I don't need a day off anymore");
					workDay=false;
				}else {
					System.out.println("I need a day off");
				}
			day++;
		}

	}

}
