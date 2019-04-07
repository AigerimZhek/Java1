package com.class19;

public class Applic {

	public static void main(String[] args) {
		Animals.canBark();
		Animals an1 = new Animals();
		

		System.out.println(an1.breed);
		System.out.println(an1.weight);
		System.out.println(an1.age);
		System.out.println(an1.name);
		an1.canBark();
		
		Animals an2 = new Animals();
		
		an2.name="Tuzik";
		an2.breed="Pug";
		System.out.println(an2.breed);
		System.out.println(an2.weight);
		System.out.println(an2.age);
		System.out.println(an2.name);
		an2.canBark();
		an2.isWild();
		
		Animals an3 = new Animals();
		
		System.out.println(an3.breed);
		System.out.println(an3.weight);
		System.out.println(an3.age);
		System.out.println(an3.name);
		an3.isWild();
		
		

		int[] arr = {5,4,8,-9,3,2,1};
		System.out.println("minimum is "+Minimum.minOfArrays(arr)); // because it is static we don't need to create an oblect
		System.out.println("maximum is "+Minimum.maxOfArrays(arr));

	}

}
