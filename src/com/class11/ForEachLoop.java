package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers= {12,13,14,15,16,17};
		for(int syntax:numbers) {
			System.out.print(syntax+" ");
		}
		System.out.println();
		
		
		System.out.println("------------------Task 1---------------------");
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars= {"BMW", "Toyota","Honda","Audi","Nissan","Mercedes"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		for(String print:cars) {
			System.out.println(print);
		}
		
		
		System.out.println("------------------Task 2---------------------");
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		//1
		String[] countries= {"Kazakhstan", "Italy", "France", "USA"};
		String[] capital = {"Astana", "Rome", "Paris","Washington"};
		
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals(capital[i])) {
		}
			System.out.println("The Capital of "+countries[i]+" is "+capital[i]);
		}
		
		//2
		 String[] array = { "USA", "Russia", "Turkey", "Spain" };
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals("USA")) {
	                System.out.println("Washington DC");
	            } else if (array[i].equals("Russia")) {
	                System.out.println("Moscow");
	            } else if (array[i].equals("Turkey")) {
	                System.out.println("Ankara");
	            } else if (array[i].equals("Spain")) {
	                System.out.println("Madrid");
	            }
	        }
	        
	        //3
	        String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
	        for (String country : contries) {
	            switch (country) {
	            case "USA":
	                System.out.println("Washington DC");
	                break;
	            case "Afghanistan":
	                System.out.println("Kabul");
	                break;
	            case "Kazakhstan":
	                System.out.println("Astana");
	                break;
	            case "Ukraine":
	                System.out.println("Kiev");
	                break;
	            }
	        }
		
		
		System.out.println("------------------Task 3---------------------");
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int arr:num) {
			sum+=arr;
		}
		System.out.println("The sum of all elements is "+sum);
	}

}
