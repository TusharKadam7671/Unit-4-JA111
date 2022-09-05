package com.question3;

public class Member {
	
	private String Name;
	private int Age;
	private String PhoneNumber;
	private String Address;
	private double Salary;
	
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}

	
	

	void printSalary()
	{
		System.out.println("Salary"+getSalary());
	}

}
