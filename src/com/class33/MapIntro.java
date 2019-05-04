package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		
		//Map<Key, Value> 
		Map <Integer,String> map = new HashMap<>();
		//add entries (key, value)
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		//retrieve/ access values
		System.out.println(map.get(102));
		//how to find the size of the map
		System.out.println(map.size());
		//how to update a map value
		map.replace(103, "Vysko4ka");
		System.out.println(map.get(103));
		//how to remove
		map.remove(104);
		System.out.println(map.size());
		//how to check if there're any values in the map
		System.out.println(map.isEmpty());
		System.out.println(map);
		//how to check a specific value
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("John"));
		
		map.put(105, "Jane");
		System.out.println(map);
		
		map.put(101, "Steve");//overriding the old value
		System.out.println(map);
		//adding null key w/some value
		map.put(null, "Some value");
		System.out.println(map);
		//adding null key with null value
		map.put(null, null);
		System.out.println(map);
		
		
	}

}
