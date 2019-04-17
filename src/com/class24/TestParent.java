package com.class24;

public class TestParent {
	public static void main(String[] args) {
		
		String a;
		a="10";
		
		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();
		
		
		
	//	Child obj1 = new Parent(); - not possible - You can't throw a bigger class into a smaller one
		
		Parent obj = new Child(); // type casting
		
		obj.work(); // Parent work
		obj.love(); //Child love
		
		// obj.cry(); - not accessible;
	}

}
