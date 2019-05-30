package com.class35;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ListOfExcTask {
	
	public static List<String> returnList () {
		
		NullPointerException e1= new NullPointerException();
		ArithmeticException e2 = new ArithmeticException();
		InputMismatchException e3 = new InputMismatchException();
		InterruptedException e4 = new InterruptedException();
		List <String> list = new ArrayList<>();
		
		list.add(e1.getMessage());
		return list;
		
	}

	public static void main(String[] args) {
		
		System.out.println(returnList());
		

	}

}
