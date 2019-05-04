package com.class31;

public abstract class University {
	
	 String name;
	    String adress;
	    int salary;
	    String vehicleType;
	    String hireDate;
	    int tellNum;

	    public University(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
	        super();
	        this.name = name;
	        this.adress = adress;
	        this.salary = salary;
	        this.vehicleType = vehicleType;
	        this.hireDate = hireDate;
	        this.tellNum = tellNum;
	    }

	    public abstract String getVehicleType();

	    public abstract String getName();

	    public abstract String getAddress();

	    public abstract double getSalary();

	    public abstract int getTellNum();

	}

	class Secretary extends University {

	    public Secretary(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
	        super(name, adress, salary, vehicleType, hireDate, tellNum);
	    }

	    @Override
	    public String getVehicleType() {
	        return super.vehicleType;
	    }

	    @Override
	    public String getName() {
	        return super.name;
	    }

	    @Override
	    public String getAddress() {
	        return super.adress;
	    }

	    @Override
	    public double getSalary() {
	        return super.salary;
	    }

	    @Override
	    public int getTellNum() {
	        return super.tellNum;
	    }

	}

	class Professor extends University {

	    public Professor(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
	        super(name, adress, salary, vehicleType, hireDate, tellNum);
	    }

	    @Override
	    public String getVehicleType() {
	        return super.vehicleType;
	    }

	    @Override
	    public String getName() {
	        return super.name;
	    }

	    @Override
	    public String getAddress() {
	        return super.adress;
	    }

	    @Override
	    public double getSalary() {
	        return super.salary;
	    }

	    @Override
	    public int getTellNum() {
	        return super.tellNum;
	    }

}
