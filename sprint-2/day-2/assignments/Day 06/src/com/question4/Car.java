package com.question4;

public class Car {
	
	private String model;
	private String companyName;
	private String color;
	private String engine;
	
	Engine e1;
	
	void getDetails()
	{
		
		System.out.println("Car Model : "+getModel());
		System.out.println("Car companyName : "+getCompanyName());
		System.out.println("Car color : "+getColor());
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	

}
