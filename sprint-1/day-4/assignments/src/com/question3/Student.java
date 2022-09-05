package com.question3;

public class Student {
	
	int roll;
	String name;
	int marks;
	 
	void displayStudentDetails()
	{
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Marks is "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.name="Tushar";
		s1.roll=0003;
		s1.marks=86;
		
		s1.displayStudentDetails();
		s1=null;
		
//		------------------------
		Student s2=new Student();
		s2.name="Prabhas";
		s2.roll=0007;
		s2.marks=96;
		
		s2.displayStudentDetails();
		s2=null;

	}


}
