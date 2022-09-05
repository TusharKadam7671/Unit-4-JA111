package com.question1;

public class ZImpl implements Z{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method 1 of ZImpl");
		
	}

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method func1 of ZImpl");
		
	}

	@Override
	public void methodZ() {
		// TODO Auto-generated method stub
		System.out.println("Inside methodZ of ZImpl");
		
	}
	
	public static void main(String[] args) {
		Z z = new ZImpl();
		
		z.func1(); //from y
		z.func2(); //from y
		z.method1(); //from x
		z.method2(); //from x
		z.methodZ(); //from z
		
		X.method3();
		Y.func3();
	}

}
