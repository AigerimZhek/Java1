package com.class27;

public class Task2 {
	
	public String name;
	public long number;
	
	public Task2() {
		
	}
	
	Task2(String name, long number){
		this.name=name;
		this.number=number;
	}

}

class UserInfo extends Task2{
	String address;
	
	UserInfo (String name, long number, String address) {
		super(name, number);
		this.address=address;
	}
	
	public void userDetails() {
		System.out.println("Name is "+name+" address is "+address+" number is "+number);
	}
}

