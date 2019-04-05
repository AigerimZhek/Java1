package com.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnValue obj = new MethodWithReturnValue();

		//int ------------------------------------------------
		int largest = obj.numbers(5, 4);
		System.out.println(largest);
		
		boolean isOdd;
		if (largest%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		System.out.println(isOdd);
		
		//String -----------------------------------------------
		String day=obj.whatIsADay();
		System.out.println(day);
		// void - action -->no return;
	}
	int numbers (int a, int b) {
		if(a>b) {
			return a;
		}else if(a<b) {
			return b;
		}else {
			return 0;
		}
	}
	String whatIsADay() {
		return "Thursday";
	}

}
