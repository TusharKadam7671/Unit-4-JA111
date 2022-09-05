package com.question1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("string1");
		arr.add("string2");
		arr.add("string3");
		
		System.out.println("---using iterator-----");
		Iterator<String> iter = arr.iterator();
		//here Iterator is interface and iterator() is a method.
		while(iter.hasNext())
		{
//			String s = iter.next();
//			System.out.println(s);
			System.out.println(iter.next().toUpperCase());
		}
		
		System.out.println("-----for loop----");
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
		
		System.out.println("-----enhanced for loop-------");
		
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
