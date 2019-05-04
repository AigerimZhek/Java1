package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllKeysAndValuesMap {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println(map);
		//returns a set of keys from the map

		Set<Integer> keys = map.keySet();
		
		for(Integer key:keys) {
		//System.out.print(key+" ");
		System.out.println(key+" : "+map.get(key));
		}

		System.out.println();
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			//System.out.print(keysIt.next()+" ");
			Integer key = keysIt.next();
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println();
		//return collection of values from map
		Collection<String> valCol = map.values();
		for(String value:valCol) {
			System.out.print(value+" ");
		}
		System.out.println("");
		Iterator<String> it = valCol.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}

}
