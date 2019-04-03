package com.class16;

public class Computer {
	
	boolean mouse, keyboard;
	int screen, ram;
	String OS, brand;
		
	public static void main(String[] args) {
		
		Computer comp1=new Computer();
		comp1.OS="Windows";
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.ram=8;
		comp1.screen=2;
		comp1.brand="Lenovo";
		
		comp1.playMusic();
		comp1.watchMovie();
		comp1.doJavaCoding();
		
		
		Computer comp2=new Computer();
		comp2.OS="Mac OS";
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.ram=6;
		comp2.screen=4;		
		comp2.brand="Apple";
		
		System.out.println("-----------------Apple-----------------");
		comp2.playMusic();
		comp2.watchMovie();
		comp2.doJavaCoding();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}

}  
