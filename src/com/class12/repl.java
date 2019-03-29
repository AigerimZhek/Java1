package com.class12;
import java.util.Scanner;
public class repl {
	
	
	  public static void main(String[] args) {
	    
	  Scanner scan=new Scanner(System.in);
	 /* int[] arr=new int[5];
	  System.out.println("Enter 5 integers");
	
	  for(int i=0; i<arr.length; i++){
	  arr[i]=scan.nextInt();
	  }
	  for(int i=0; i<arr.length; i++) {
	  int mult=arr[i]*10;
	  System.out.println(mult);
		}*/
	  
	/*  Scanner scan=new Scanner(System.in);
	  int[] arr=new int[5];
	  for(int i=0; i<arr.length; i++){
	    arr[i]=scan.nextInt();
	  }
	  for(int i=4; i>0; i--){
	    System.out.println(arr[i]);
			
			
		}*/
		  
		 
		  /*		double[][] a = {
		  			{1.4,2.0,3.3,2},
		  			{4,1.5,6.1,1},
		  			{1.2,3.1,4,1.6}
		  		};
		  		
		  		//Double and print array
		  		
		  		for(int i=0; i<a.length; i++){
		  		  for(int j=0; j<a[i].length; j++) {
		  		  System.out.print((a[i][j])*2);
		  		}
		  		System.out.println();
		  		}
		  	*/
		  
		 
		  	/*	int[][] a = {
		  			{5,2,3,7},
		  			{1,5,2,2},
		  			{1,2,3,4}
		  		};
		  		
		       //should print 10
		       int sum=0;
		       for(int i=2; i<a.length; i++) {
		         for(int j=0; j<a[i].length; j++){
		           sum=sum+a[i][j];
		           
		         }
		       }System.out.print(sum);

		  	*/
		  
		  
		 /* 		int[][] a = {
		  			{5,2,3,7},
		  			{1,5,1,1},
		  			{8,3,1,2}
		  		};
		  //should be 8
		  int max= a[0][0];
		  for(int i=0; i<a.length; i++) {
		    for(int j=0; j<a[i].length; j++) {
		      if(a[i][j]>max){
		    	  max=a[i][j];
		        
		      }
		    }
		  }System.out.println(max);*/
		  
		  
		 
		/*			int[][] a = {
						{1,1,1},
						{1,1,1},
						{1,1,1}
					};
			 //should be true
			 for(int i=0; i<a.length; i++) {
			   for(int j=0; j<a[i].length; j++){
			     if(i==j) {
			    	 
			     }
			   }
			 }System.out.println(true);*/
		  
		  
		  /*int[][] a = {
					{1,1,2}, //sum = 4
					{3,1,2}, //sum = 6
					{3,5,3}, //sum = 11
					{0,1,2}  //sum = 3
				};
		  
		  for(int i=0; i<a.length; i++) {
			  int sum=0;
			  for (int j=0; j<a[i].length; j++) {
				 
				  sum=sum+a[i][j];
				  
			  }System.out.println(sum);
		  }*/
		    	
		  	
		  int[][] a = {
					{-5,-2,-3,7},
					{1,-5,-2,2},
					{1,-2,3,-4}
				};
				int negativeOdd=0;
				 for(int i=0; i<a.length; i++) {
					  for (int j=0; j<a[i].length; j++) {
					    if((a[i][j]<0) && (a[i][j]%2!=0)){
					   
					    	negativeOdd++;
					    }
						 
					  }
				  }
				 System.out.println(negativeOdd);
				 
	
				 String str = "abracadabra alakazam";
				    String target1 = "dab";
				    String target2 = "ABRA";
				    
				    System.out.println(str.indexOf("c"));
		  	
		  
				    System.out.println("Enter any programming language");
				    String language = scan.nextLine(); 
				   
				   if(language.contains("Java")) {
				     System.out.println("Java is a programming language.");
				   }
	}
}

