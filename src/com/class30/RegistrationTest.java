package com.class30;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration user = new Registration();
		user.setEmail("zhekibaevaa@gmail.com");
		user.setUserName("Aigerim");
		user.setPass("701111255a");
		
		System.out.println(user.getEmail()+" "+user.getUserName()+" "+user.getPass());

	}

}
