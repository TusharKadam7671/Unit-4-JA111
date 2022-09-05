package com.question3;

import java.util.Scanner;;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public void displaycourseDetails() {
		
		System.out.println("Course Details :");
		System.out.println("Course ID : "+courseId);
		System.out.println("Course Name : "+courseName);
		System.out.println("Course Fee : "+courseFee);
		
		
	}
	
	public static void authenticate(String username, String password) {
		
		if(username.equals("Admin") && password.equals("1234"))
		{
//			System.out.println("in");
			
			Course c = new Course();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter course id :");
			int id = sc.nextInt();	
			c.courseId=id;
			
			sc.nextLine();
			
			System.out.println("Enter course name :");
			String name = sc.nextLine();
			c.courseName=name;
			
			System.out.println("Enter course fee :");
			int fee = sc.nextInt();
			c.courseFee=fee;
			
			c.displaycourseDetails();
			sc.close();
			
		}else
		{
			System.out.println("Invalid Username or Password");
		}
	}
	
	public static void main(String[] args) {
		authenticate("Admin","1234");
		
	}

}
