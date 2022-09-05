package com.question2;

public class Demo {

	public Demo()
	{
		System.out.println("inside Demo() constuctor");
	}
	
	public Demo(String s)
	{
		this();
		System.out.println("inside Demo(String s) constructor "+s);
	}
	
	public Demo(int i)
	{
		this("hello");
		System.out.println("inside Demo(int i) "+i);
	}
	
	public Demo(float f)
	{
		this(10);
		System.out.println("inside Demo(float f) "+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo(55.55f);
		

	}
}
