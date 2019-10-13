package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrListString {

	public static void main(String[] args) {
		
		List <Object> list = new ArrayList<>();
		
		list.add("A");
		list.add(55);
		list.add("Fun");
		list.add(4);
		
		List<String> sList = new ArrayList<>();
		
			for(Object l:list) {
				sList.add(l.toString());
			}
		

			sList.retainAll(list);
		System.out.println(sList);
	}

}
