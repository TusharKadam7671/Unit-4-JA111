package com.question1;

public class Employee {
	
	private int Id;
	private String Name;
	private double Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
	

}
