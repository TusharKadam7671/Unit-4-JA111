package com.question3.bank;

public class Bank {
	
	//you can not change the access level of the Bank constructor
	//from private to public but you can create your own method
	//inside the bank class.
	private Bank()
	{
		System.out.println("Inside private constructor of Bank");
	}
	
	//bank constructor is private so will not visible
	//for main class to make an object of bank class
	//only visible here, so need to make one method that
	//will return object after creating.
	
	public static Bank getObject()
	{
		//make object here
		Bank bank = new Bank();
		
		//return object from here
		return bank;
	}

}
