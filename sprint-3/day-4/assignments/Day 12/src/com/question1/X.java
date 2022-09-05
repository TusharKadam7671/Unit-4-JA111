package com.question1;

public interface X {
	
//	public abstract void method1();
	void method1();
//--inside an interface if we place any method without body, that method
//will be public and abstract whether we mention it or not.
	
	public default void method2()
	{
		System.out.println("Inside Default method 'method2' of interface X");
	}
	
	public static void method3()
	{
		System.out.println("Inside Static method 'method3' of interface X");
	}

}
