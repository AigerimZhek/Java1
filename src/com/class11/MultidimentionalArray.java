package com.class11;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// creating 2D array;
		
		//using new keyword
		int[][] d=new int[4][4]; //4*4=16 elements;
		
		//first row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//second row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//third row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		//fourth row
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
		System.out.println(d[3][2]);
		
        for(int i=0; i<d.length; i++) {
        	for(int j=0; j<d.length; j++) {
        		System.out.print(d[i][j]+" ");
        	}
        	System.out.println();
			
		}
        //without using new keyword
        
        int[][] c = {{12,13,14,15},
        		       {1,2,3,4},
        		      {5,10,15,20},
        		   {100,200,300,400}    };
        
        
        System.out.println(c[3][1]);//200
        System.out.println(c[0][0]);//12
        
	
        //array of Strings
        
        String[][] groups= { 
        		             {"Jawid","Mustafa","Amina","Mahri","Emily","Ahmad"},
        		             {"Aigerim", "Anastasia","Adrian","Fabi"}        		
        };
        
        System.out.println(groups[1][3]);//Fabi
        System.out.println(groups[0][4]);//Emily
        
       for(int j=0; j<groups.length; j++) {
        	for(int y=0; y<groups[j].length; y++) {
        		System.out.print(groups[j][y]+" ");
        	}
        	System.out.println();
        }
        
        
        }
	}


