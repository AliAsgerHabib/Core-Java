package com.habib.section8.chapter2;


public class Main {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		if(v1 instanceof Bike)
		{
			((Bike) v1).driveBike();
		}
		else if(v1 instanceof Car c1){
			c1.driveCar();
		}
		else {
			v1.driveVehicle();
		}
	}
}
