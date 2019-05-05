package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car car1 = new Car("Toyota", "Corolla");
		//Car car2 = new Car("Honda", "Accord");
		//Car car3 = new Car("Lada", "Priora");
		
		//car1.carDetails();
		//car2.carDetails();
		//car3.carDetails();
		
		Map<Integer, Car> carMap = new HashMap<>();
		carMap.put(1, new Car("BMW","x8"));
		carMap.put(2, new Car("Audi","R8"));
		carMap.put(3, new Car("Mercedes","cls"));
		
		Collection<Car> carValues = carMap.values();
		for(Car car:carValues) {
			car.carDetails();
		}
		

	}

}
