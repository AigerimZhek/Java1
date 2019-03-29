package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// create a grocery list: fruits/veggies/dairy;
		
		String[] grocery= {"Fruits","Veggies","Dairy"};
		String[][] arr= {{"Apples","Grapes","Pears","Strawberries","Mandarins","Bananas"},
				         {"Cucumbers","Carrots","Potatoes","Tomatoes","Bell Peppers","Onions"},
				         {"Milk","Cheese","Kefir","Sour Cream"}
		} ;
		
			for(int i=0; i<arr.length; i++) {
				
					System.out.print(grocery[i]+": ");
				
			for(int y=0; y<arr[i].length; y++) {
				
			System.out.print(arr[i][y]+" ");
			}
			
			System.out.println();	
			}
		

	}

}
