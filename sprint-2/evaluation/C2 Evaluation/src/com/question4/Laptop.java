package com.question4;

public class Laptop {
	
	private String color;
	private String companyName;
	private String name;
	private String purpose;
	
	CPU cpu;
	GraphicCard graphicCard;
	
	
	void displayDetails() {
		Laptop laptop = new Laptop();
		GraphicCard gc=new GraphicCard();
		CPU cpu = new CPU();
		
		System.out.println("Laptop Name:"+laptop.getName());
		System.out.println("Company Name:"+laptop.getCompanyName());
		System.out.println("Laptop Color:"+laptop.getColor());
		System.out.println("Laptop Purpose:"+laptop.getPurpose());
		
		System.out.println("Cpu's Manufacturer:"+cpu.getManufacturer());
		System.out.println("Cpu's Processor:"+cpu.getProcessor());
		System.out.println("Cpu's ClockSpeed:"+cpu.getClockSpeed());
		
		System.out.println("Graphic card's Manufacturer:"+gc.getManufacturer());
		System.out.println("Graphic card's Series:"+gc.getSeries());
		System.out.println("Graphic card's Capacity:"+gc.getCapacity());
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public CPU getCpu() {
		return cpu;
	}


	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	public GraphicCard getGraphicCard() {
		return graphicCard;
	}


	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}

	

}
