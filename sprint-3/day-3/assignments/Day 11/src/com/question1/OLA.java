package com.question1;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		
		
		if(numberOfPassenger<=3)
		{
			
			HatchBack hatchback = new HatchBack();
			hatchback.setNumberOfPassenger(numberOfPassenger);
			hatchback.setNumberOfKms(numberOfKms);
			return hatchback;
		}else
		{
			
			Sedan sedan = new Sedan();
			sedan.setNumberOfPassenger(numberOfPassenger);
			sedan.setNumberOfKms(numberOfKms);
			return sedan;
		}
	}
	
	public int calculateBill(Car car) {
		
		
		if(car instanceof HatchBack) {
			HatchBack h = (HatchBack)car;
			int numberOfKms = h.getNumberOfKms();
			int farePerKm = h.farePerKm;
			
			int totalFare = numberOfKms * farePerKm;
			return totalFare;
		}else
		{
			Sedan s = (Sedan)car;
			int numberOfKms = s.getNumberOfKms();
			int farePerKm = s.farePerKm;
			
			int totalFare = numberOfKms * farePerKm;
			return totalFare;
		}
		
	}

}
