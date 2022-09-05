package com.question1;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student()
	{
		
	}

	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	void displayDetails()
	{
		System.out.println("Roll Number : "+getRoll());
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Marks : "+getMarks());
	}
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
