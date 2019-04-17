package com.class24;

//parent class
public class Bank {

	public int chargeInterest () {
		return 0;
	}
}

//1 child
class BOA extends Bank {
	@Override //- annotation
	public int chargeInterest () {
		return 2;
	}
}

//2 child
class PNC extends Bank{
	@Override
	public int chargeInterest () {
		return 3;
	}
}