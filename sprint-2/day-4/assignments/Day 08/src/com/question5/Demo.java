package com.question5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int number = sc.nextInt();
		sc.nextLine();
		
		double total=0;
		
		String[] arr = new String[number];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter Student Name");
			String name=sc.nextLine();
			
			arr[i]=name;
			
			s.setName(name);
			
			System.out.println("Enter "+arr[i]+"'s address");
			String address=sc.nextLine();
			s.setAddress(address);
			
			System.out.println("Enter "+arr[i]+"'s Student marks");
			int marks=sc.nextInt();
			s.setMarks(marks);
			total=total+marks;
			
			System.out.println("Enter "+arr[i]+"'s Student roll number");
			int roll=sc.nextInt();
			s.setRoll(roll);
			
			sc.nextLine();
			
			System.out.println("Name: "+s.getName().toUpperCase());
			System.out.println("Address: "+s.getAddress());
			System.out.println("Roll: "+s.getRoll());
			System.out.println("Marks: "+s.getMarks());
			
			System.out.println("----------------------------");
			
		}
		
		double avg=total/number;
		System.out.println("Average marks is : "+avg);
		
//		for(String i:arr)
//		{
//			System.out.println(i);
//		}

	}

}
