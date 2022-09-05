package com.question3;

import java.util.Arrays;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		int[] result=new int[] {};
		//int[] result={};
		
		int l=0;
		
		for(int i=0; i<inputArray.length; i++)
		{
			int j=0;
			
			for(int k=2; k<=inputArray[i];k++)
			{
				if(inputArray[i]%k==0)
				{
					j++;
				}
			}
			
			if(j==1)
			{
				l++;
				result=Arrays.copyOf(result,  0+l);
				result[l-1]=inputArray[i];
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		int[] arr= new int[] {10,12,5,50,11,14,15};
		//int[] arr = {10,12,5,50,11,14,15};
		
//		for(int i:arr)
//		{
//			
//			System.out.println(i);
//		}
		int[] result = main.findAndReturnPrimeNumbers(arr);
		if(result.length>0)
		{
			for(int i=0; i<result.length; i++)
			{
				System.out.println(result[i]);
			}
		}else
		{
			System.out.println("Prime number not found in the supplied Array");
		}

	}

}
