package com.question3;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
		
//		this.employeeId=employeeId;
//		this.employeeName=employeeName;
		
		this.hourlyWages=hourlyWages;
		this.hoursWorked=hoursWorked;
		
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
//		TemporaryEmployee t = new TemporaryEmployee();
		
//		double salary =t.salary= hoursWorked*hourlyWages;
//		t.setSalary(salary);
		
		setSalary(hourlyWages*hoursWorked);
		
		
	}

	@Override
	public String toString() {
		return "TemporaryEmployee [hoursWorked=" + hoursWorked + ", hourlyWages=" + hourlyWages + "]";
	}
	
	

}
