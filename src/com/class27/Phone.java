package com.class27;

public abstract class Phone {//abstract class
	
	public void makeCall() {
		System.out.println("Phone can make calls");
	}
	
	public void sendText() {
		System.out.println("Phone can send texts");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();
}

class Iphone extends Phone{
	//concrete class - is a class thats inherited from an abstract class or 
	//implemented by interface and providing implementation of all unimplemented/ abstract classes

	@Override
	public void unlockPhone() {
		System.out.println("To onlock iPhone we can use FaceId or FingerPrint");		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Iphone you can go to Images");
	}
}

class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung we need to enter a password");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures we need to go to Gallery");	
	}	
}