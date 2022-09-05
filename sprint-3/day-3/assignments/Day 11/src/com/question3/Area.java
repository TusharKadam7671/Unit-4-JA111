package com.question3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int area=length*breadth;
//		System.out.println("Area of the Rectangle : "+area);
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area=side*side;
//		System.out.println("Area of the Squre : "+area);
		return area;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		float area=(float)3.14*(radius*radius);
//		System.out.println("Area of the Circle : "+(int)area);
		return (int)area;
	}

}
