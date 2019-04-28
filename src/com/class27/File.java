package com.class27;

public abstract class File {
	
	public abstract void open();
	
	
	public void edit() {
		System.out.println("We can edit the file");
	}
	
	public void close() {
		System.out.println("We can close the file");
	}

}

class JavaFile extends File{

	@Override
	public void open() {

		System.out.println("To open Java file we need Sublime text");
	}
	
}

class WordFile extends File{

	@Override
	public void open() {

		System.out.println("To open .doc file we need Microsoft Word");
	}
	
}

class PDF extends File {

	@Override
	public void open() {

		System.out.println("To open PDF file we need PDF viewer");
	}
	
}
