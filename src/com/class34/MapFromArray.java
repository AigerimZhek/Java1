package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapFromArray {

	public static void main(String[] args) {
		
		String[] names = {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap = new LinkedHashMap<>();
		
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		
		for (Map.Entry<Integer, String> me:nameMap.entrySet()) {
			String str = me.getKey()+" - "+me.getValue();
			System.out.println(str);
		}
		
		Iterator<Map.Entry<Integer, String>> it = nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
