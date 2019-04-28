package com.class29;

public class SudentTast {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setAge(17);
		obj.setName("Alex");
		
		System.out.println(obj.getName()+" is "+obj.getAge());
	}
}
