package com.class28;

public abstract class Vehicle {

	static int vehicleCount;
	public Vehicle() {

		vehicleCount++;
	}
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop a vehicle by pressing the break");
	}
	//public static abstract void gps();- cannot have static abstract methods, cause static methods can't be overridden.same with final and private
	public static void displayVehicles() {
		System.out.println("Total vehicles we built = "+vehicleCount);
	}
}

abstract class Car extends Vehicle {

	public String make;
	Car(String make){
		this.make=make;
	}
}

class BMW extends Car {

	BMW(String make){
		super(make);
	}
	@Override
	public void start() {
		System.out.println("BMW car starts remotely");
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
	}
}


class Toyota extends Car {

	Toyota(String make) {
		super(make);
	}
	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
	}
}