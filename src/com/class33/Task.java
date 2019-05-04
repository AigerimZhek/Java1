package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        Set <String> hlist = new LinkedHashSet<>(aList);
        
        for(String h:hlist) {
        	System.out.println(h);
        }
        
	}
}
