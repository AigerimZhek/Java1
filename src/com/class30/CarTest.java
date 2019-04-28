package com.class30;

public class CarTest {

	public static void main(String[] args) {
		Car obj = new Sedan(20, "black", 50000.0);
		System.out.println(obj.calcSalePrice());
		
		Car obj1 = new Truck(2000, "white",9000.0);
		System.out.println(obj1.calcSalePrice());

	}

}
