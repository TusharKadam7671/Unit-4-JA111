package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Number of Students you want to enter");
		int number=sc.nextInt();
		System.out.println("===============================");
		
		for(int i=0; i<number; i++)
		{
			System.out.println("Enter the Roll Number");
			int i1=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Name");
			String i2=sc.nextLine();
			
			System.out.println("Enter marks");
			double i3=sc.nextDouble();
			
			
			System.out.println("Student Details 0"+(i+1));
			System.out.println("Student Roll Number:"+i1);
			System.out.println("Student Name:"+i2);
			System.out.println("Student Mark:"+i3);
			System.out.println("==========================");
			
		}
		
		
	}

}
