package com.class32;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {

		Visa visa1 = new Visa("visa platinum");
		Visa visa2 = new Visa("visa platinum");
		Visa visa3 = new Visa("visa platinum");

		PNC pnc1 = new PNC("visa platinum");
		PNC pnc2 = new PNC("visa platinum");
		PNC pnc3 = new PNC("visa platinum");

		CreditCard[] visaArray = { visa1, visa2, visa3, pnc1, pnc2, pnc3 };
		// parent of all classes
		// autoboxing
		// array of object type
		// we can store heterogeneous types
		Object[] objectArray = { visa1, pnc1, "John" };

	}

}
