package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of passengers");
		int passengers = sc.nextInt();
		
		System.out.println("Enter number of kms");
		int kms = sc.nextInt();
		
//		System.out.println(passengers);
//		System.out.println(kms);
		
		OLA myOla = new OLA();
		
		Car myCar = myOla.bookCar(passengers, kms);
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is : "+res);

	}

}
