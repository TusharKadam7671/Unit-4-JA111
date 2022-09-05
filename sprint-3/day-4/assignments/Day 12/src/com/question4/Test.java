package com.question4;

import java.util.Arrays;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {};
		
		
		int l = 0;
		
		for(int i=2; i<=p; i++)
		{
			int count=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				arr=Arrays.copyOf(arr, arr.length+1);
				arr[l++]=i;
				
			}
		}
		
//		for(int i=0; i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		return arr;
	}
	

}
