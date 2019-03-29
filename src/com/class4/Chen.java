package com.class4;

import java.util.Scanner;

public class Chen {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("In:");
		String name=sc.nextLine();
		
		
		if(name.equals("Chen")) {
			System.out.println("teacher");
		} else {
			System.out.println("student");
		}
		
	}

}
