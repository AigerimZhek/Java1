package com.class11;

public class Tasks2 {
	public static void main(String[] args) {
		
		/*
		 * Create an array of cars : american, german, korean, italian. Then retrieve all values from that array
		 */
		String[][] cars= {{"American:","Ford","Buick","Chevrolet"},
				          {"German:","Audi","BMW","Volkswagen","Mercedes"},
				          {"Korean:","Kia","Huyndai","Daewoo"},
				          {"Italian:","Ferrari","Maserati","Lamborghini","Alfa Romeo"}		
		};
		
		for(int i=0; i<cars.length; i++) {
			for(int y=0; y<cars[i].length; y++) {
				System.out.print("\n"+cars[i][y]+" ");
			}
			System.out.println();
		}
		
		/*
		 * Create an array of countries: 
		 * north american countries, south american countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array.
		 */
		System.out.println("----------------------Task 2---------------------");
		
		String[][] countries= { {"North American countries:","Unites States,","Canada"},
				                {"South American countries:","Bolivia,","Salvador,","Guatemala,","Argentina,","Columbia,","   Chile,","Peru,","Brazilia"},
				                {"European countries:","France","Spain","Italy","Finland","Switzerland","United Kingdom"},
				                {"Asian countries:","Kazakhstan","South Korea","North Korea","China","Japan","Kyrgyzstan","India","Vietnam","Philippines"},
				                {"African countries:","Algeriya","Somalia","Sudan","Niger","Zambia","South Africa"}
		};
		
		for(String[] i:countries ) {
			for(String j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
