package com.question5;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public double getNetSalary() {
		return netSalary;
	}



	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}



	public void calculateNetSalary(int pfPercentage) {
		
		Employee e=new Employee();
//		System.out.println("salary"+e.getSalary());
//		double value= (double) (e.getSalary() * (pfPercentage/100));
//		
//		e.setNetSalary(value);
		
		e.setNetSalary((e.getSalary()*pfPercentage)/100);
		
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
