package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		System.out.println("Enter the character you want to access");
		int i=sc.nextInt();
		
		char ch=s.charAt(i);
		
		System.out.println("Character at position "+i+" is : "+ch);

	}

}
