package com.class26;

public class Bank {
	
	int balance;
	
	public void getBalance() {
		System.out.println("Your balance is "+balance);
	}

}

class BankA extends Bank {
	final public void getBalance() {
		balance = 1000;
		System.out.println("Your balance is "+balance);
	}
}

class BankB extends Bank {
	public void getBalance() {
		balance = 1500;
		System.out.println("Your balance is "+balance);
	}
}

class BankC extends Bank {
	public void getBalance() {
		balance = 2000;
		System.out.println("Your balance is "+balance);
	}
}


/* CANNOT OVERRIDE FINAL METHOD

 * class D extends BankA{ 
 * public void getBalance() {
 * 
 * }
 *  }
 */