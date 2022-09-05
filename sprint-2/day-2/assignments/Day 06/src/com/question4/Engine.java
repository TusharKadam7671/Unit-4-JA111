package com.question4;

public class Engine {

	private int rmp;
	private int power;
	private String manufacturer;
	private boolean hasTurbo;

	boolean enableTurbo(String hasTurbo) {
		if (hasTurbo == "yes") {
			return true;
		} else {
			return false;
		}
	}

	public Engine()
	{
		System.out.println("Car rmp : " + 11000);
		System.out.println("Car power : " + 150);
		System.out.println("Car manufacturer : " + "TATA");
		System.out.println("Car has turbo : " + true);
	}
	
	
	
	
	public Engine(int rmp, int power, String manufacturer, boolean hasTurbo) {
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;

		System.out.println("Car rmp : " + rmp);
		System.out.println("Car power : " + power);
		System.out.println("Car manufacturer : " + manufacturer);
		System.out.println("Car has turbo : " + hasTurbo);
	}
	
	

	public int getRmp() {
		return rmp;
	}

	public void setRmp(int rmp) {
		this.rmp = rmp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isHasTurbo() {
		return hasTurbo;
	}

	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	
	

	

}
