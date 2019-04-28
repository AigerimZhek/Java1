package com.class28;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle obj = new BMW("bmw");
		obj.drive();
		obj.start();
		obj.stop();
		
		obj = new Toyota("camry");
		obj.drive();
		obj.start();
		obj.stop();
		
		//System.out.println(Vehicle.vehicleCount);
		Vehicle.displayVehicles();
	}

}
