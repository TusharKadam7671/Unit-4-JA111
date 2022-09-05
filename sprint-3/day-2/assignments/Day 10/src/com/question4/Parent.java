package com.question4;

public abstract class Parent {
	
	final int number;
	
	public Parent(int i)
	{
		number = i;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	
	//method 1
	public abstract void method1();
	
	//method 2
	public final void method2()
	{
		System.out.println("Inside method 2 of parent class");
	}
	
	//method 3
	public void method3()
	{
		System.out.println("Inside method 3 of parent class");
	}

}
