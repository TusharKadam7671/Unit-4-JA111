package com.question1;

public class Person {
	
	String name;
	String gender;
	Address address;
	
	Person()
	{
		
	}
	
	Person(String name, String gender)
	{
		this.name=name;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
