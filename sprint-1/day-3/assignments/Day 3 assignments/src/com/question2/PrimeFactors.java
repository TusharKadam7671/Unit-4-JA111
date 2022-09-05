package com.question2;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prime(12);

	}
	
	public static void prime(int num) {
		if(num>2 && num<100)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
		}else
		{
			System.out.println("Invalid");
		}
		
	}

}
