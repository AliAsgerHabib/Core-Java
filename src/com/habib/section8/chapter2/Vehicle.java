package com.habib.section8.chapter2;

public class Vehicle {
	public void driveVehicle()
	{
		System.out.println("Driving a Vehicle");
	}
}

class Car extends Vehicle {
	public void driveCar()
	{
		System.out.println("Driving a Car");
	}
}

class Bike extends Vehicle {
	public void driveBike()
	{
		System.out.println("Driving a Bike");
	}
}