package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapReview {

	public static void main(String[] args) {
		
		// create a map of grocery products and it is quantity

			Map<String, Integer> groceryMap = new LinkedHashMap<>();
			groceryMap.put("Milk", 1);
			groceryMap.put("Bread", 2);
			groceryMap.put("Eggs", 12);
			groceryMap.put("Coffee", 2);
			groceryMap.put("Potato", 2);
			groceryMap.put("Cookies", 3);

			System.out.println(groceryMap);
			groceryMap.put("Cheese", 1);
			System.out.println(groceryMap.size());

			groceryMap.replace("Eggs", 18);
			System.out.println(groceryMap);

			groceryMap.remove("Cheese");
			System.out.println(groceryMap);

			// retrieving all keys+values using keySet();
//			Set<String> keySet = groceryMap.keySet();
//			for (String key : keySet) {
//				System.out.println("Key is "+key+" and values is "+groceryMap.get(key));
//			}
//			
//			Iterator<String> keyIt=keySet.iterator();
//			while(keyIt.hasNext()) {
//				String key=keyIt.next();
//				System.out.println(key+":"+groceryMap.get(key));
//			}
			for (String key :groceryMap.keySet()) {
				System.out.println("Key is "+key+" and values is "+groceryMap.get(key));
			}
			Iterator<String> keyIt=groceryMap.keySet().iterator();
			while(keyIt.hasNext()) {
				String key=keyIt.next();
				System.out.println(key+":"+groceryMap.get(key));
			}
			// retrieving all values using;
//			Collection<Integer> valCollection=groceryMap.values();
//			for(Integer value:valCollection) {
//				System.out.println(value);
//			}
			for(Integer value: groceryMap.values()) {
				System.out.println(value);
			}
			Iterator<Integer> valueIt=groceryMap.values().iterator();
			while(valueIt.hasNext()) {
				System.out.println(valueIt.next());
			}
			
			for(Map.Entry<String, Integer> entry:groceryMap.entrySet()) {
				String mapValue = entry.getKey()+" = "+entry.getValue();
				System.out.println(mapValue);
			}
//map--> using entrySet we will get Set --> any collection has iterator method --> returns Iterator of Entry type
			Iterator <Map.Entry<String,Integer>> it = groceryMap.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry<String,Integer> ent = it.next();
				String valFromMap = ent.getKey()+" : "+ent.getValue();
				System.out.println(valFromMap);
			}
	}

}
