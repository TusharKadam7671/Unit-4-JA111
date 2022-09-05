package com.question1;

public class NaturalNumbers {
	
	public static int natural(int num) {
		int sum=(num*(num+1))/2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of 5 natural number is: "+natural(5));
		System.out.println("Sum of 10 natural number is: "+natural(10));

	}

}
