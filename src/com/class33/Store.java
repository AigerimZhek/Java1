package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Store {

	public static void main(String[] args) {
		// Create a map of Best Buy store. Place
		//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Print all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer,String> bestBuy = new HashMap<>();
		
		bestBuy.put(785, "Printer");
		bestBuy.put(587, "Screen");
		bestBuy.put(123, "Keyboard");
		bestBuy.put(965, "TV");
		bestBuy.put(401, "Laptop");
		
		System.out.println("____________ForEachLoop____________");
		for(Map.Entry<Integer, String> item:bestBuy.entrySet()) {
			System.out.println(item.getKey()+" - "+item.getValue());
		}
		System.out.println("____________Iterator__________");
		Iterator<Map.Entry<Integer,String>> it = bestBuy.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> me = it.next();
			System.out.println(me.getKey()+" : "+me.getValue());
			
		}
	}

}
