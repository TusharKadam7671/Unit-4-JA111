package com.question4;

import java.util.Scanner;

public class Main {
	
//	static Laptop laptop = new Laptop();
//	static GraphicCard gc=new GraphicCard();
//	static CPU cpu = new CPU();
	
	public static Laptop getLaptop(String laptopPurpose) {
		//logic
		Laptop laptop = new Laptop();
		GraphicCard gc=new GraphicCard();
		CPU cpu = new CPU();
		
		if(laptopPurpose=="bussiness")
		{
			laptop.setName("Aero 13");
			laptop.setCompanyName("HP");
			laptop.setColor("Rose Gold");
			laptop.setPurpose("bussiness");
			
			cpu.setManufacturer("Intel");
			cpu.setProcessor("i5 10210U");
			cpu.setClockSpeed(1800.0);
			
			gc.setManufacturer("Intel");
			gc.setSeries("Iris Xe");
			gc.setCapacity("Integrated");
			
			
		}
		else if(laptopPurpose=="gaming")
		{
			laptop.setName("Acer");
			laptop.setCompanyName("Radeon");
			laptop.setColor("Black");
			laptop.setPurpose("gaming");
			
			cpu.setManufacturer("Radeon");
			cpu.setProcessor("Ryzen 9 5800H");
			cpu.setClockSpeed(3200.0);
			
			gc.setManufacturer("Radeon");
			gc.setSeries("RTX 3050 Ti");
			gc.setCapacity("16GB");
		}else
		{
			System.out.println("error");
		}
//		
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String type=sc.nextLine();
		
		if(type=="gaming")
		{
			
			Laptop gamingLaptop=getLaptop("gaming");
			gamingLaptop.displayDetails();
		}else if(type=="bussiness")
		{
			Laptop bussinessLaptop=getLaptop("bussiness");
			bussinessLaptop.displayDetails();
			
		}else
		{
			System.out.println("Please Enter a Valid purpose");
		}
		
		

	}

}
