package com.class24;

public class TestEmployees {

	public static void main(String[] args) {

		Employee emp = new Employee();
		FullTime ft = new FullTime();
		Contractor contractor = new Contractor();
		
		emp.getPaid();//Employee gets paid
		ft.getPaid(); // Full time employee gets paid salary + bonus
		contractor.getPaid();

	}

}
