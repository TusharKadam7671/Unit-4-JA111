package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student details 1");
		System.out.println("Enter roll number");
		int roll=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name");
		String name=sc.nextLine();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		if(age<=60 && age>=18) {
			if(marks>=0 && marks<=500)
			{
				Student s1=new Student(roll,name,age,marks);
				s1.displayDetails();
			}else
			{
				System.out.println("Please check entered marks");
			}
		}else
		{
			System.out.println("Not a valid age");
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Enter student details 2");
		System.out.println("Enter roll number");
		int roll1=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name");
		String name1=sc.nextLine();
		
		System.out.println("Enter age");
		int age1=sc.nextInt();
		
		System.out.println("Enter marks");
		int marks1=sc.nextInt();
		
		if(age1<=60 && age1>=18) {
			if(marks1>=0 && marks1<=500)
			{
				Student s2=new Student();
				s2.setRoll(roll1);
				s2.setName(name1);
				s2.setAge(age1);
				s2.setMarks(marks1);
				
				s2.displayDetails();
			}else
			{
				System.out.println("Please check entered marks");
			}
		}else
		{
			System.out.println("Not a valid age");
		}

	}

}
