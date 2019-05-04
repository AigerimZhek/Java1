package com.class32;

import java.util.HashSet;

public class Neww {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
	     
	     hset.add("first");
	     hset.add("second");
	     hset.add("third");
	     hset.add("fourth");
	     hset.add("fifth");
	     
	     System.out.println("HashSet contains:"+hset);
	     
	  // Creating an Array
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	 
	     System.out.println(array[0]);
	     // Displaying Array elements
	     System.out.print("Array elements: ");
	     for(String temp : array){
	        System.out.print(temp+" ");
	     }
	     

	}

}
