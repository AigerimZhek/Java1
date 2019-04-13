package com.class22;

public class CallinStaticVsNonStaticClass {

	public static void main(String[] args) {

		StaticVsNonStatic obj = new StaticVsNonStatic();
		
		System.out.println(obj.name);
		obj.getInfo();
		
		//access static members by using class name they belong to;
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();
		
	}

}
