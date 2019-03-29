package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int a = 1; a <= 5; ++a) {
			System.out.println("i - "+a);
			   // codes inside the body of outer loop
			   for (int b = 1; b <=2; ++b) {
				   System.out.println("j - "+b);
			      // codes inside the body of both outer and inner loop
			   }
			   // codes inside the body of outer loop 
			}
		//-------------------------------------------------------------------------------------------------------------
		
		for (int i=0; i<3; i++) {
			System.out.println("---I am Outer loop---");
			for(int y=0; y<3; y++) {
				System.out.println("I am Inner loop");
			}
		}
		//-------------------------------------------------------------------------------------------------------------
		
		for (int x=0; x<3; x++) {
			for(int z=0; z<3; z++) {
				System.out.println("I am Inner loop");
			}
			System.out.println("---I am Outer loop---");
		}
		//-------------------------------------------------------------------------------------------------------------
		
		for (int k = 1; k <= 5; ++k) {

	         System.out.println("Outer loop iteration " + k);

	         for (int j = 1; j <=2; ++j) {
	            System.out.println("i = " + k + "; j = " + j);
	         }
	      }
		//--------------------------------------------------------------------------------------------------------------
		
		 int rows = 5;
	      
	      for(int c = 1; c <= rows; ++c)
	      {
	          for(int d = 1; d <= c; ++d)
	          {
	             System.out.print(d + " ");
	          }
	          System.out.println("");
	      }
	      //------------------------------------------------------------------------------------------------------------
	      for (int p=0; p<3; p++) {
				for(int r=0; r<3; r++) {
					System.out.println("out "+p);
				System.out.println("in "+r);
				}
			}

	}
}
