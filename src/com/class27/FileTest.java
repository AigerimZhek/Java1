package com.class27;

public class FileTest {

	public static void main(String[] args) {
		
		File obj = new JavaFile();
		obj.open();
		obj.edit();
		obj.close();
		
		obj = new WordFile();
		obj.open();
		obj.edit();
		obj.close();
		
		obj = new PDF();
		obj.open();
		obj.edit();
		obj.close();

	}

}
