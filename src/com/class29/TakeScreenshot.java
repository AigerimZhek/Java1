package com.class29;

public interface TakeScreenshot {
	
	String fileExtention=".png"; //by default it is public static final, and it MUST be initialized;
	
	void takeScreen();

	
	static void m1() {
		System.out.println("Static m1 method");
	}
	
	default void m2() {
		System.out.println("Default m2 method");
	}
}
