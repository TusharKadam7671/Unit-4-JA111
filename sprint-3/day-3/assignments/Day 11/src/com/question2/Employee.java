package com.question2;

import java.util.Scanner;

public class Employee {
	
	public double calculateAverage(int[] age){
		
		int count=age.length;
		int sum=0;
		for(int i:age)
     		{
				sum+=i;
			}
		double result=(double)sum/count;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no. of employees:");
		int num = sc.nextInt();
		
		if(num<2)
		{
			System.out.println("Please enter a valid employee count");
			sc.close();
		}else
		{
			System.out.println("Enter the age for "+num+" employees");
			int[] age = new int[num];
			for(int i=0; i<num; i++)
			{
				int value = sc.nextInt();
				age[i]=value;
			}
			
//			for(int i:age)
//			{
//				System.out.println(i);
//			}
			
			Employee emp = new Employee();
			double result = emp.calculateAverage(age);
			System.out.println("The average age is "+result);
		}
		
		
		
		

	}

}
