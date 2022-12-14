package com.question1;

public class Instructor extends Person{
	
	private int instructorId;
	private int salary;
	
	public Instructor() {
		
	}
	
	Instructor( String name, String gender,int instructorId,int salary)
	{
		super(name,gender);
		this.instructorId=instructorId;
		this.salary=salary;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}

}
