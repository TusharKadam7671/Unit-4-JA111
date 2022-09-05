package com.question4;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	public void displayDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll number");
		int roll=sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		
		
		Student s = new Student(roll,name,marks);
//		System.out.println(s);
		setRoll(roll);
		setName(name);
		setMarks(marks);
		
		char grade = gradeCal();
		setGrade(grade);
		System.out.println( toString());
	}
	
	private char gradeCal()
	{
		
		char grade;
		
		int m = getMarks();
//		System.out.println("tush"+m);
//		System.out.println(marks);
		
		if(m>=500)
		{
			grade='A';
		}else if(m>=400)
		{
			grade='B';
		}else
		{
			grade='C';
		}
		return grade;
	}

	

	Student()
	{
		
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
//		this.grade = grade;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
	

}
