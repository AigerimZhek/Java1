package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Building {

	public static void main(String[] args) {
		// Create a map of a building. 
		//Store floor number and it is associated company name. 
		//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
		//Check how many entries you have?
		//		Update company on a 4th floor
		//		Remove company on the 7th floor
		//		Print your map
		
		
		Map<Integer,String> floors = new HashMap<>();
		
		floors.put(1, "Google");
		floors.put(2, "Syntax");
		floors.put(3, "Apple");
		floors.put(4, "Google");
		floors.put(4, "Microsoft");
		floors.put(5, "Geico");
		floors.put(7, "CapitalOne");
		
		System.out.println(floors);
		floors.put(4, "Google");
		System.out.println(floors);
		
		floors.remove(7);
		System.out.println(floors);

	}

}
