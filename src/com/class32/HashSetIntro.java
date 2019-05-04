package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(12);
		hset.add(32);
		hset.add(34);
		
		System.out.println(hset.size());//3
		System.out.println(hset);// doesn't keep the order
		System.out.println(hset.contains(32));
		//Set Interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size());//3
		
		//to retrieve all values from hashset
		
		//for  each loop
		for(int num:hset) {
			System.out.println(num);
		}
		
		System.out.println("__________________");
		//iterator
		Iterator<Integer> it = hset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
