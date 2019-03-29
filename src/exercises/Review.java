package exercises;

public class Review {

	public static void main(String[] args) {
		 /* Write a program that prints the following pattern
	       *
	       * Output:
	                  1 2 3 4 5 6 7 8 9 10
	                  2 4 6 8 10 12 14 16 18 20
	                  3 6 9 12 15 18 21 24 27 30
	                  4 8 12 16 20 24 28 32 36 40
	                  5 10 15 20 25 30 35 40 45 50
	       */
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=10; y++) {
				
				System.out.print((y*i)+" ");
			}
		
		System.out.println();
		}
		
		  /**
	        * Write a program that prints the following pattern
	        *
	        * ....1
	        * ...22
	        * ..333
	        * .4444
	        * 55555
	        *
	        */
	        
	        
	        //1 to 5
	        //1 to 5-i
	        //1 to i
	        
	        for(int i =1; i<=5; i++) {
	        	for(int y=1; y<=(5-i); y++) {
	        		System.out.print(".");
	        	}
	        	for(int j=1; j<=i; j++) {
	        	System.out.print(i);
	        	}
	        	System.out.println();
	        }
	/* Write a program that prints the following pattern
	        *
	....1
	...2
	..3
	.4
	5
	*/
	        for (int i=1; i<=5; i++) {
	        	for (int y=1;y<=(5-i); y++) {
	        		System.out.print(".");
	        	}
	        	
	        	System.out.print(i);
	        	//for(int j=1; j>=1; j--) {
	        	System.out.println();
	        }
	        
	        /**
	         * Write a program to produce the following pattern
	         *
	 ....1
	 ...2.
	 ..3..
	 .4...
	 5....

	         *
	         */
	        
	        for (int i=1; i<=5; i++) {
	        	for(int y=5; y>=1; y--) {
	        		
	        	
	        	if(y==i) {
	        	System.out.print(i);
	        	}else {
	        		System.out.print(".");
	        	}
	        	}
	        	System.out.println();
	}
	}

}
