package com.question1;

public interface Y {

	//one abstract method
	public abstract void func1();
	//or void func1();
	
	//one default method
	public default void func2()
	{
		System.out.println("Inside default method func2 of interface Y");
	
	}
	
	//one static method
	public static void func3()
	{
		System.out.println("Inside static method func3 of interface Y");
	}
}
