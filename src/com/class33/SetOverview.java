package com.class33;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOverview {
	public static void main(String[] args) {
		
		Set <String> classDays = new LinkedHashSet<>();
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		
		System.out.println(classDays);
		
		System.out.println("-----------------------Enhanced loop--------------------------");
		for(String days:classDays) {
			System.out.println(days);
		}
		
		System.out.println("------------------Iterator-----------------------");
		Iterator <String> it = classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
