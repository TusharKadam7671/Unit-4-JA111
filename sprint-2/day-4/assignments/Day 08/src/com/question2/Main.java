package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter no of columns");
		int columns=sc.nextInt();
		
		int[][] arr=new int[rows][columns];
		
		int count=1;
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j]=count;
				count++;
			}
		}
		
		
		
		//to get sum of even numbers from rows
		
//			for(int[] ar:arr) {
//			
//				int sum=0;
//			for(int i:ar) {
//				if(i%2==0)
//				{
//					sum+=i;
//				}
//			}
//			System.out.println(sum);
//		}
		
		
		//to get sum of even numbers form columns
		for(int i=0; i<columns; i++)
		{
			int sum=0;
			for(int j=0; j<rows; j++)
			{
				if(arr[j][i]%2==0)
				{
					sum+=arr[j][i];
				}
				
			}
			
			System.out.println(sum);
		}

	}

}
