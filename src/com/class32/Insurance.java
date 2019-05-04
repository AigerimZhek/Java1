package com.class32;

public abstract class Insurance {

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println(carModel + " got a quote for it's " + insuranceName + " insurance");
	}

	@Override
	public void cancelInsurance() {
		System.out.println(carModel + " cancelled  " + insuranceName + " insurance");
	}

}

class Pet extends Insurance {

	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println(petType + " got a quote for it's " + insuranceName + " insurance");

	}

	@Override
	public void cancelInsurance() {
		System.out.println(petType + "  cancelled it's " + insuranceName + " insurance");

	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);

	}

	@Override
	public void getQuote() {
		System.out.println("You received a quote for your " + insuranceName + " insurance");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You cancelled your " + insuranceName + " insurance");

	}

}