package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("-------Object of the parent class-------");
		Phone phone = new Phone();
		phone.hasCamera();
		phone.makeCall();
		System.out.println();
		
		
		System.out.println("-------Object of iPhone class-------");
		Iphone iphone = new Iphone();
		iphone.hasCamera();
		iphone.makeCall();
		System.out.println();
		
		
		System.out.println("-------Object of Samsung class-------");
		Samsung sams = new Samsung();
		sams.hasCamera();
		sams.makeCall();
		System.out.println();
		
		
		System.out.println("-------Object of Nokia class-------");
		Nokia nokia = new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		nokia.cannotBreak();
		System.out.println();
		
		
		System.out.println("-------Object of iPhone class referring to the Parent-------");
		
		Phone p;
		
		p=new Iphone();
		p.hasCamera();
		p.makeCall();
		System.out.println();
		
		
		System.out.println("-------Object of Nokia class referring to the Parent-------");
		p = new Nokia();//reassigning; using only parentReference variable
		p.makeCall();
		p.hasCamera();
		//p.cannotBreak(); - method is undefined because parentClass doesn't have an access to childClass methods
		System.out.println();
		
		
		System.out.println("-------Object of Samsung class referring to the Parent-------");
		p = new Samsung();
		p.hasCamera();
		p.makeCall();
	}

}
