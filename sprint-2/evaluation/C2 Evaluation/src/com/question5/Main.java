package com.question5;

import java.util.Scanner;;

public class Main {
	
	public static Employee getEmployeeDetails() {
		
		Employee e=new Employee();
     Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		e.setEmployeeId(id);
		
		sc.nextLine();
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		e.setEmployeeName(name);
		
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		
		e.setSalary(salary);
		
		System.out.println("Enter PF percentage:");
		int pf=sc.nextInt();
		e.calculateNetSalary(pf);
		
//		double value= (double) (e.getSalary() * (pf/100));
		e.setNetSalary((e.getSalary()*pf)/100);
		

		
		
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e=getEmployeeDetails();
		
		//output
		System.out.println("----------------------------");
		System.out.println("Id: "+e.getEmployeeId());
		System.out.println("Name: "+e.getEmployeeName());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Net Salary: "+(e.getSalary()-e.getNetSalary()));
		
//		Employee.name

	}

}
