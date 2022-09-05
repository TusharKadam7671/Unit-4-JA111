package com.question3;

public class Loan {
	
	
	private Loan()
	{
		
	}
	
	public static Loan  getLoanObject()
	{
		Loan l = new Loan();
		return l;
	}
	public double calculateLoanAmount(Employee employeeObj)
	{
		double loan=0;
		if(employeeObj instanceof PermanentEmployee)
		{
//			PermanentEmployee p = (PermanentEmployee)employeeObj;
//		 System.out.println(p.getSalary());
			employeeObj.calculateSalary();
			loan = 0.15*employeeObj.getSalary();
			
//			System.out.println(loan);
			return loan;
		}else
		{
			employeeObj.calculateSalary();
//			TemporaryEmployee t = (TemporaryEmployee)employeeObj;
			loan = 0.10*employeeObj.getSalary();
//			System.out.println(loan);
			return loan;
		}
	}

}
