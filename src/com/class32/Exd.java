package com.class32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Exd {
	
	  
	public static ArrayList<String> test()
	{
		ArrayList<String> names = new ArrayList<String>();

		Set<String> hs = new LinkedHashSet<String>();
		names.add("Shiva");
		names.add("Sandish");
		names.add("Asel");

		return names;
	}
	public static void main(String[] args){

   ArrayList<String> arr= test();
   System.out.println(arr);
   
   
	  
	  
	  
	  
	  
	  
	  }
	}
