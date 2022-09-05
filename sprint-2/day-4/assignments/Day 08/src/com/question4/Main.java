package com.question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(args.length);
		
		int n=args.length;
		
		if(n==1)
		{
			int num= Integer.parseInt(args[0]);
			int fact=1;
			for(int i=1; i<=num; i++)
			{
				fact=fact*i;
			}
			
			System.out.println(fact);
		}else if(n==2)
		{
			int num=Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
			int fact=1;
			for(int i=1; i<=num; i++)
			{
				fact=fact*i;
			}
			
			System.out.println(fact);
		}else
		{
			System.out.println("Error");
		}

	}

}
