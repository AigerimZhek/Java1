package com.class26;

public class BankTest {
	

	public static void main(String[] args) {
		

		Bank b;
		
		b=new Bank();
		b.getBalance();
		
		b= new BankA();
		b.getBalance();
		
		b= new BankB();
		b.getBalance();
		
		b= new BankC();
		b.getBalance();
	}

}
