package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		
		String str = "Stones";
		
		char [] strArr=str.toLowerCase().toCharArray();
		
		

		String[] arr = {"A", "B", "D", "B", "F", "R", "A", "B"};
		//System.out.println(Arrays.toString(arr));
		Set<String> remove = new HashSet<String>();
		
		for(String a:arr) {
			if(remove.add(a) == false) {
				System.out.println("Duplicate value is: "+a);
			}
		}
		
		
		//remove duplicates from array: --> using HashSet!
		for(String a:arr) {
			remove.add(a);	
		}
		
		
		for(String b:remove) {
			System.out.println(b);
		}
		
	}

}
