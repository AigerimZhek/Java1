package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Car car = new Car("Geico", "Toyota");
		Pet pet = new Pet("Buddy", "Dog");
		Health health = new Health("BlueCross BlueShield");
		
		ArrayList<Insurance> alist = new ArrayList<Insurance>();
		
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		System.out.println("--------------calling methods using For each loop-----------------");
		for (Insurance type:alist) {
			type.cancelInsurance();
			type.getQuote();
		}
		
		System.out.println("------------calling methods using For loop-------------");
		
		for(int i=0; i<alist.size(); i++) {
			Insurance type = alist.get(i);
			type.cancelInsurance();
			type.getQuote();
		}
		
		System.out.println("-------------calling methods using Iterator----------------");
		
		Iterator<Insurance> it = alist.iterator();
		
		while(it.hasNext()) {
			Insurance type = it.next();
			type.cancelInsurance();
			type.getQuote();
		}

	}

}
