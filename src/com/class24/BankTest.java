package com.class24;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank();
		BOA boa = new BOA();
		PNC pnc = new PNC();
		
		System.out.println(bank.chargeInterest());
		System.out.println(boa.chargeInterest());
		System.out.println(pnc.chargeInterest());
	}

}
