package com.class9;

public class Clock {

	public static void main(String[] args) {
		String b="am";
		String c="pm";
		boolean morning=false;
		
		for(int i=0; i<=11; i++) {
			
			for(int y=0; y<=5; y++) {
				for(int z=0; z<=9; z++) {
					if(morning) {
				System.out.println("The time is "+i+":"+y+z+b);
			}else {
				System.out.println("The time is "+i+":"+y+z+c);
			}
	      }
		}
    }
}
}