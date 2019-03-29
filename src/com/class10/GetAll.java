package com.class10;

public class GetAll {

	public static void main(String[] args) {
	
		String[] names= {"John", "Mike", "Jane", "Talgat", "Olga","Mehmet","Siyar"};
		
		int a=3;
		
		System.out.println(names[a]);//Talgat
		a+=2;
		System.out.println(names[a]);//Mehmet
		a-=4;
		System.out.println(names[a]);//Mike
		
		//----------------------------------------------------------------------------
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
