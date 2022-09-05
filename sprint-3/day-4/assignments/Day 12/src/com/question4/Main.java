package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Test t = new Test();
//		System.out.println(num);
		int[] arr = t.display(num);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
