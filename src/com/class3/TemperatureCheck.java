package com.class3;

public class TemperatureCheck {
	public static void main(String[] args) {
		
		float mytemp=35.7f;
		float t=32;
		
		if (mytemp<t) {
			System.out.println("Water will freeze with temperature "+mytemp);
		}
		else {
			System.out.println("Water will not freeze with temperature "+mytemp);
		}
	}

}
