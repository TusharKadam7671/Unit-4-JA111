package com.question2;

public class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken biryani from TajHotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa from TajHotel");
		
	}
	
	//specific method of TajHotel.
	public void welcomeDrink()
	{
		System.out.println("Welcome Drink from the TajHotel");
	}

}
