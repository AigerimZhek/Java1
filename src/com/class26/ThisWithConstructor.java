package com.class26;

public class ThisWithConstructor {
	
	ThisWithConstructor() {
		System.out.println("I have no parameters");
	}
	
	ThisWithConstructor(String str) {
		this();
		System.out.println("I have 1 String parameter "+str);
	}
	
	ThisWithConstructor(String str1,String str2) {
		//this();
		this(str2);
		System.out.println("I have 2 String parameters "+str1+" "+str2);
	}
	
	public static void main(String[] args) {
		//ThisWithConstructor obj1 =new ThisWithConstructor();
		//ThisWithConstructor obj2 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj3 = new ThisWithConstructor("Hello","Bye");
	}

}
