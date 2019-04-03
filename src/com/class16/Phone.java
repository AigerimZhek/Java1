package com.class16;

public class Phone {
	
	String model, os;
	boolean homeButton, touchScreen;
	int inch;
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------");
		Phone ph1=new Phone();
		ph1.model="iPhone";
		ph1.os="iOS";
		ph1.homeButton=false;
		ph1.touchScreen=true;
		ph1.inch=13;
		
		ph1.call();
		ph1.camera();
		ph1.message();
		ph1.game();
		
		System.out.println("------------------------------------------");
		Phone ph2=new Phone();
		ph2.model="Samsung";
		ph2.os="Android";
		ph2.homeButton=true;
		ph2.touchScreen=true;
		ph2.inch=12;
		
		ph2.call();
		ph2.game();
		
		System.out.println("------------------------------------------");
		Phone ph3 =new Phone();
		ph3.model="Nokia";
		ph3.os="Android";
		ph3.homeButton=true;
		ph3.touchScreen=false;
		ph3.inch=10;
		
		ph3.message();
		ph3.camera();
	}
	
	void call() {
		System.out.println("You can make calls from "+model);
	}
	void camera() {
		System.out.println("You can take pictures and record videos from "+model);
	}
	void message() {
		System.out.println("You can send messages from "+model);
	}
	void game() {
		System.out.println("You can play games");
	}

}
