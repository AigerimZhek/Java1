package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee{
	public static void main(String[] args) {
		WaterfallTeam wt = new WaterfallTeam();
		
		wt.salary1 = 90000;  // can access protected member from different package through inheritance
		// wt.salary - can't access default members from different package
		
		wt.test();// available cause it's protected
		//wt.test1();// not available cause it's default
		
	}

}
