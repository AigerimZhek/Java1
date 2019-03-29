package com.class10;

public class Arrays {
	public static void main(String[] args) {
		
		double [] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	     
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      // Finding the largest element
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);  
	     //------------------------------------------------------------------------------------------ 
	      
	      int [] nums = {1,2,3,4,5,6,7,8,9,10};
	      for(int i=0; i<nums.length; i++ ) {
	    	  System.out.print(nums[i]+" ");
	      
	   }	System.out.println();
	      
	   
	      int all=0;  
	      for(int i=0; i<nums.length; i++) {
	    	  all=all+nums[i];
	      }
	      System.out.println(all);
	      
	      
	      int mult=nums[0];
	      for (int i=0; i<nums.length; i++) {
	    	  if(nums[i]>mult)mult = nums[i];
	      }
	      System.out.println(mult);
	
	}

}
