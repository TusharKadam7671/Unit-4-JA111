package com.question2;

import java.util.Scanner;

public class Demo {
	
	public Hotel providedFood(int amount) {
		if(amount>1000)
		{
			TajHotel tajhotel = new TajHotel();
			return tajhotel;
		}else if(amount>200 && amount<1000)
		{
			RoadSideHotel roadsidehotel = new RoadSideHotel();
			return roadsidehotel;
		}else
		{
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a valid amount");
		int amount = sc.nextInt();
		
		Demo demo = new Demo();
		Hotel hotel = demo.providedFood(amount);

		while(hotel==null)
		{
			System.out.println("Please enter a valid amount");
			int newAmount = sc.nextInt();
			hotel = demo.providedFood(newAmount);
		}
		
		if(hotel instanceof TajHotel)
		{
			TajHotel tajhotel = (TajHotel)hotel;
			tajhotel.chickenBiryani();
			tajhotel.masalaDosa();
			tajhotel.welcomeDrink();
		}else
		{
			RoadSideHotel roadsidehotel = new RoadSideHotel();
			roadsidehotel.chickenBiryani();
			roadsidehotel.masalaDosa();
//			roadsidehotel.welcomeDrink();  //CE
		}
	}

}
