package com.question5;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle fuelCar = new FuelCar();
		Vehicle electricCar = new ElectricCar();
		
		fuelCar.run();
		fuelCar.service();
		
		
		electricCar.run();
		

	}

}
