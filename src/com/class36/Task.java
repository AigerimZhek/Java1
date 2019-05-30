package com.class36;

public class Task {
	
	

	public static void main(String[] args) {
		// create an exception: when user it trying to withdraw larger amount that the balance
	    //throw an exception saying “You do not have enough money”
		withdrawMoney(510,500);
		

	}
	
	public static void withdrawMoney(int amount, int balance) {
		
		if(amount<=balance) {
			System.out.println("Here is your money");
		}else {
			throw new ArithmeticException("You don't have enough money");
		}
	}

}
