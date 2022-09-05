package com.question4;

import java.util.Scanner;



public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public boolean check(int i, int l)
	{
		if(i>l-1)
		{
			return false;
		}else
		{
			return true;
		}
	}
	
	public void method(String str)
	{
		
//		int i=first();
		
		
		int i = sc.nextInt();
		
		
		if(check(i,str.length()))
		{
			
			char ch = str.charAt(i);
			System.out.println("Character at the position "+i+" => "+ch);
			sc.close();
		
		}else
		{
			System.out.println("Invalid postion, Please enter a valid position =>");
			method(str);
			
		}
	}
	
//	public int first()
//	{
//		
//		return i;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		
		
		System.out.println("Enter a String");
		
		String str = sc.nextLine();
		

		System.out.println("Enter a position");
		main.method(str);
		
		
		
		
		
	}

}
