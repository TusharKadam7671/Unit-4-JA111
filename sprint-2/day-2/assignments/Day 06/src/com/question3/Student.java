package com.question3;

import java.util.Scanner;

public class Student {
	

	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	//zero argument constructor
	public Student() {
		
	}
	
	
	//parameterized constructor
	Student(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName="NIT";
	}
	
	public Student (int roll, String name, String address, String collageName) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	

	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCollageName() {
		return collageName;
	}



	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}



	
	
	public static Student getStudent(boolean isFromNIT)
	{
		
		Scanner sc = new Scanner(System.in);
		
		if(isFromNIT==true)
		{
//			Student student=new Student();
			
			
			System.out.println("Enter Roll Number :");
			int roll=sc.nextInt();
//			student.roll=roll;
			sc.nextLine();
			
			
			System.out.println("Enter Student Name :");
			String name=sc.nextLine();
//			student.name=name;
			
			System.out.println("Enter Address :");
			String address=sc.nextLine();
//			student.address=address;
			
			Student student=new Student(roll,name,address);
			
			
			
			
			System.out.println("Roll Number: "+student.getRoll());
			System.out.println("Name: "+student.getName());
			System.out.println("Address: "+student.getAddress());
			System.out.println("Collage Name: "+student.collageName);
			
			System.out.println("-----------------------");
			
		}else
		{
			
//			Student student=new Student();
			
			
			System.out.println("Enter Roll Number :");
			int roll=sc.nextInt();
//			student.roll=roll;
			sc.nextLine();
			
			
			System.out.println("Enter Student Name :");
			String name=sc.nextLine();
//			student.name=name;
			
			System.out.println("Enter Address :");
			String address=sc.nextLine();
//			student.address=address;
			
			System.out.println("Enter Collage Name");
			String collage=sc.nextLine();
			
			Student student2=new Student(roll,name,address,collage);
			
			System.out.println("Roll Number: "+student2.getRoll());
			System.out.println("Name: "+student2.getName());
			System.out.println("Address: "+student2.getAddress());
			System.out.println("Collage Name: "+student2.collageName);
			
			System.out.println("-----------------------");
		}
		return null;
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
