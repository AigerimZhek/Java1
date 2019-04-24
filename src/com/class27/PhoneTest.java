package com.class27;

public class PhoneTest {
	public static void main(String[] args) {
		
		// Phone obj = new Phone(); - can't instantiate Phone class cause it's an abstract class
		
		System.out.println("-------iPhone-------");
		Phone phone1 = new Iphone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
		
		
		System.out.println("-------Samsumg-------");
		phone1 = new Samsung();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
	}

}
