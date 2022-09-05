package com.question4;

import java.util.Scanner;

public final class Child extends Parent{
	
	public Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Number : "+getNumber());
		System.out.println("Inside method 1 of child class");
		
	}
	
	
	//method 4
	public void method4() {
		System.out.println("Inside method 4 of child class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number between the range of 1 to 10");
		int number = sc.nextInt();
		
		if(number<=10 && number>=1)
		{
			Parent x = new Child(number);
			x.method1();
			x.method2();
			x.method3();
//			x.method4();   //CE
		}else
		{
			System.out.println("Invalid number");
		}
		
		

	}

	

}
