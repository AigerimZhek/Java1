package com.class30;

public class Registration {
	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password. Requirements: Valid email consider to be only gmail Valid userName
	 * and password cannot be empty and should be of length larger than 6
	 * characters. Also valid password cannot contain userName.
	 */

	private String email;
	private String userName;
	private String password;
	
	public void setEmail(String email) {
		if(email.contains("gmail")) {
		this.email=email;
		}
	}
	
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
		this.userName=userName;
		}
	}
	
	public void setPass(String password) {
		if(!password.isEmpty() && password.length()>6 && !password.equals(userName)) {
		this.password=password;
		}
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPass() {
		return password;
	}
}
