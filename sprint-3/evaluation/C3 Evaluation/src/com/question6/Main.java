package com.question6;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double getStudent(int choice)
	{
		if(choice==1)
		{
			ArtStudent s = new ArtStudent();
			System.out.println("Enter the Marks for Hindi:");
			int h=sc.nextInt();
			s.setHindiMarks(h);
			
			System.out.println("Enter the Marks for English:");
			int e=sc.nextInt();
			s.setEnglishMarks(e);
			
			System.out.println("Enter the Marks for History:");
			int hi=sc.nextInt();
			s.setHistoryMarks(hi);
			
			double percentage = s.findPercentage();
			return percentage;
		
		}else if(choice==2)
		{
			ScienceStudent s = new ScienceStudent();
			System.out.println("Enter the Marks for Maths:");
			int m=sc.nextInt();
			s.setMathMarks(m);
			
			System.out.println("Enter the Marks for Chemistry:");
			int c=sc.nextInt();
			s.setChemistryMarks(c);
			
			System.out.println("Enter the Marks for Physics:");
			int p=sc.nextInt();
			s.setPhysicsMarks(p);
			
			System.out.println("Enter the Marks for Biology:");
			int b=sc.nextInt();
			s.setBiologyMarks(b);
			
			double percentage = s.findPercentage();
			return percentage;
		}else if(choice==3)
		{
			CommerceStudent s = new CommerceStudent();
			System.out.println("Enter the Marks for Account:");
			int a=sc.nextInt();
			s.setAccountMarks(a);
			
			System.out.println("Enter the Marks for Economics:");
			int e=sc.nextInt();
			s.setEconomicsMarks(e);
			
			System.out.println("Enter the Marks for BussinessStudies:");
			int b=sc.nextInt();
			s.setBussinessStudiesMarks(b);
			
			double percentage = s.findPercentage();
			return percentage;
		}
		return 0.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. ArtStudent");
		System.out.println("2. ScinceStudent");
		System.out.println("3. CommerceStudent");
		
		int choise = sc.nextInt();
		
		double percentage = getStudent(choise);
		if(percentage==0.0)
		{
			System.out.println("Invalid choice");
		}else
		{
			
			System.out.println("Percentage is: "+percentage);
		}
	}

}
