package com.class17_2;

public class Practice {

	public static void main(String[] args) {

		for (int i=1; i<=4; i++) {
			for(int y=1; y<=5; y++) {
				System.out.print(y);
			}
			System.out.println("");
		}
		//-----------------------------------------------------------------------------------
		
		for (int i=1; i<=8; i++) {
			for(int y=1; y<=7; y++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		//-----------------------------------------------------------------------------------
		
		for(int a=1; a<=10; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b+" ");
			}
			System.out.println("");
		}
		//-----------------------------------------------------------------------------------
		
		for(int a=1; a<=10; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(a+" ");
			}
			System.out.println("");
		}
		//-----------------------------------------------------------------------------------
		
		for(int c=0; c<4; c++) {
			for(int d=0; d<5; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
       //-------------------------------------------------------------------------------------
		
		for(int c=0; c<4; c++) {
			for(int d=5; d>0; d--) {
				System.out.print(d);
			}
			System.out.println();
		}
		//------------------------------------------------------------------------------------
		
		for(int i=5; i>=1; i--) {
			for(int y=1; y<=5; y++) {
		System.out.print(i);
	   }
			System.out.println();
		}
		//-----------------------------------------------------------------------------------
		
		for(int i=1; i<=4; i++) {
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--) {
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//-------------------------------------------------------------------------------------
		for(int i=1; i<=4; i++) {
			for(int y=1; y<=6; y++) {
				if(i==1 || i==4 || y==1 || y==6) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//--------------------------------------------------------------------------------------
	}
}
