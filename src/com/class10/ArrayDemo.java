package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] numbers=new int[4];
		
		numbers[0]=1;
		numbers[1]=15;
		
		System.out.println(numbers[2]);//0
		            // 0, 1, 2, 3
		int[] array= {10,20,30,40};// another way of declaring and assigning values
		System.out.println(array[2]);
		
		System.out.println(array.length); //to find a size of the array
		
		//string of names(5)
		String[] names= {"John", "Mike", "Jane", "Talgat", "Olga"};
		System.out.println("There are "+names.length+" values in my array of names");
		System.out.println(names[2]);
		
		

	}

}
