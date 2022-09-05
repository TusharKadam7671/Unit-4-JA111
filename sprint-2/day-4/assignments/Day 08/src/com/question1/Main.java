package com.question1;

import java.util.Scanner;

public class Main {

	
	public static String reversString(String input){
		//write the logic
		

		StringBuilder sb = new StringBuilder("");
		
 		
		
		char[] arr= input.toCharArray();
		
		
		for(int i=arr.length-1; i>=0; i--) {
			
			sb.append(arr[i]);
		}
		
	
		
		return sb.toString();
		
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.nextLine();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);

	}

}
