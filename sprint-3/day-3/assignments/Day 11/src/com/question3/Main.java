package com.question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape=new Area();
		
		//try once by taking input from user using scanner class-
		
		int rectangle=shape.rectangleArea(5, 8);
		int square=shape.squareArea(3);
		int circle=shape.circleArea(4);
		
		System.out.println("Area of the Rectangle : "+rectangle);
		System.out.println("Area of the Squre : "+square);
		System.out.println("Area of the Circle : "+circle);


	}

}
