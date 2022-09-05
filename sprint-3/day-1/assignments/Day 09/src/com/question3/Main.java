package com.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		Manager manager = new Manager();
		
		
		
		//manager-->
		
		System.out.println("Enter Manager Details");
		
		System.out.println("Enter Department");
		String department=sc.nextLine();
		manager.setDepartment(department);
		
		
		
		System.out.println("Enter Specialisation");
		String specialisation=sc.nextLine();
		manager.setSpecialisation(specialisation);
		
		
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		manager.setName(name);
		
		System.out.println("Enter Age");
		int age=sc.nextInt();
		manager.setAge(age);
		
		System.out.println("Enter Phone Number");
		String phoneNumber=sc.next();
		manager.setPhoneNumber(phoneNumber);
		
		sc.nextLine();
		
		System.out.println("Enter Address");
		String address=sc.nextLine();
		manager.setAddress(address);
		
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		manager.setSalary(salary);
		
		System.out.println("Department: "+manager.getDepartment());
		System.out.println("Specialisation: "+manager.getSpecialisation());
		System.out.println("Name: "+manager.getName());
		System.out.println("Age: "+manager.getAge());
		System.out.println("Phone Number: "+manager.getPhoneNumber());
		System.out.println("Address: "+manager.getAddress());
		System.out.println("Salary: "+manager.getSalary());
		
		System.out.println("------------------------");
		
		
		//employee-->
		
		System.out.println("Enter Employee Details");
		
		System.out.println("Enter Department");
		
		sc.nextLine();
		String department1=sc.nextLine();
		employee.setDepartment(department1);
		
		
		
		System.out.println("Enter Specialisation");
		String specialisation1=sc.nextLine();
		employee.setSpecialisation(specialisation1);
		
		
		
		System.out.println("Enter Name");
		String name1=sc.nextLine();
		employee.setName(name1);
		
		System.out.println("Enter Age");
		int age1=sc.nextInt();
		employee.setAge(age1);
		
		System.out.println("Enter Phone Number");
		String phoneNumber1=sc.next();
		employee.setPhoneNumber(phoneNumber1);
		
		sc.nextLine();
		
		System.out.println("Enter Address");
		String address1=sc.nextLine();
		employee.setAddress(address1);
		
		System.out.println("Enter Salary");
		double salary1=sc.nextDouble();
		employee.setSalary(salary1);
		
		System.out.println("Department: "+employee.getDepartment());
		System.out.println("Specialisation: "+employee.getSpecialisation());
		System.out.println("Name: "+employee.getName());
		System.out.println("Age: "+employee.getAge());
		System.out.println("Phone Number: "+employee.getPhoneNumber());
		System.out.println("Address: "+employee.getAddress());
		System.out.println("Salary: "+employee.getSalary());
		
		System.out.println("------------------------");
	}

}
