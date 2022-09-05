package com.question3;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int employeeId, String employeeName, double basicpay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
//		this.employeeId=employeeId;
//		this.employeeName=employeeName;
		
		this.basicPay=basicpay;
//		System.out.println(this.toString());
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
//		PermanentEmployee e = new PermanentEmployee();
		
		double pf= basicPay*0.12;
//		double salary=e.salary=basicPay-pf;
//		e.setSalary(salary);
		setSalary(basicPay-pf);
		
	}

	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + "]";
	}
	
	

}
