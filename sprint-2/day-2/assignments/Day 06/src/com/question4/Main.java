package com.question4;

public class Main {
	
//	static void car() {
//		
//		
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		car();
		
		//car 1-
		Car c1 = new Car();
		
		c1.setModel("Harrier");
		c1.setCompanyName("TATA");
		c1.setColor("White");

		c1.getDetails();
		c1.e1 = new Engine(10000,110,"TATA",true);
		
		
		System.out.println("-----------------");
		
		//car 2-
		Car c2 = new Car();
		
		c2.setModel("Scorpio");
		c2.setCompanyName("TATA");
		c2.setColor("Black");
		
		c2.getDetails();
//		Engine e2=new Engine();
		c2.e1=new Engine();
		
		System.out.println("-----------------");
		

	}

}
